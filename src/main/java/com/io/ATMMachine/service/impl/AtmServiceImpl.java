package com.io.ATMMachine.service.impl;

import com.io.ATMMachine.model.ATM;
import com.io.ATMMachine.model.dto.ATMDto;
import com.io.ATMMachine.model.dto.AtmWithBankDto;
import com.io.ATMMachine.model.dto.BankDto;
import com.io.ATMMachine.model.dto.impl.AtmWithBankDtoImpl;
import com.io.ATMMachine.repository.AtmRepository;
import com.io.ATMMachine.service.AtmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AtmServiceImpl implements AtmService {

    private final AtmRepository atmRepository;
    @Override
    public ATM save(ATM atm) {
        return atmRepository.save(atm);
    }

    @Override
    public Optional<ATMDto> findBankById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<ATM> findAllBanks() {
        return null;
    }

    @Override
    public Optional<ATM> findAtmById(Long id) {
        return atmRepository.findById(id);
    }

    @Override
    public List<ATM> findAllAtms() {
        return atmRepository.findAll();
    }

    @Override
    public List<ATM> findAtmsByBankCode(int bankCode) {
        return atmRepository.findByBankCode(bankCode);
    }

    @Override
    public ATM findAtmByAtmNumber(int atmNumber) {
        return atmRepository.findByAtmNumber(atmNumber);
    }


    @Override
    public List<AtmWithBankDto> findAllAtmsWithBank() {
        return atmRepository.findAllAtmsWithBank().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private AtmWithBankDto mapToDto(ATM atm) {
        return new AtmWithBankDtoImpl(
                atm.getAtmNumber(),
                atm.getAtmAddress(),
                new BankDto(
                        atm.getBank().getBankCode(),
                        atm.getBank().getBankName(),
                        atm.getBank().getLegalAddress()
                )
        );
    }
}