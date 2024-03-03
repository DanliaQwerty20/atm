package com.io.ATMMachine.service.impl;

import com.io.ATMMachine.model.ATM;
import com.io.ATMMachine.model.dto.ATMDto;
import com.io.ATMMachine.service.AtmService;

import java.util.List;
import java.util.Optional;

public class AtmServiceImpl implements AtmService {
    @Override
    public ATM save(ATM atm) {
        return null;
    }

    @Override
    public Optional<ATMDto> findBankById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<ATM> findAllBanks() {
        return null;
    }
}
