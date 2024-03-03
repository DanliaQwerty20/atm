package com.io.ATMMachine.repository.jbdc;

import com.io.ATMMachine.model.Bank;
import com.io.ATMMachine.model.dto.BankDto;
import com.io.ATMMachine.repository.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Repository
@AllArgsConstructor
public class JbdcBankRepository implements BankRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Bank save(Bank bank) {
        String sql = "INSERT INTO banks (bank_name, legal_address) VALUES (?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bank.getBankName());
            ps.setString(2, bank.getLegalAddress());
            return ps;
        }, keyHolder);
        int bankCode = Objects.requireNonNull(keyHolder.getKey()).intValue();
        bank.setBankCode(bankCode);
        return bank;
    }

    @Override
    public List<Bank> findAll() {
        String sql = "SELECT * FROM banks";
        List<Bank> banks = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Bank.class));
        return banks;
    }

    @Override
    public Optional<BankDto> findById(Long id) {
        String sql = "SELECT * FROM banks WHERE bank_code = ?";
        List<BankDto> banks = jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(BankDto.class));
        if (banks.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(banks.get(0));
    }
}
