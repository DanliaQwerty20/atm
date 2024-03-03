package com.io.ATMMachine.service.impl;

import com.io.ATMMachine.model.Bank;
import com.io.ATMMachine.model.dto.BankDto;
import com.io.ATMMachine.repository.BankRepository;
import com.io.ATMMachine.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;

    public Bank save(Bank bank) {
        return bankRepository.save(bank);
    }

    public List<Bank> findAllBanks() {
        return bankRepository.findAll();
    }

    public Optional<BankDto> findBankById(Long id) {
        return bankRepository.findById(id);
    }

}
