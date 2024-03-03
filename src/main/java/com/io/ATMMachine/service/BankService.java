package com.io.ATMMachine.service;

import com.io.ATMMachine.model.Bank;
import com.io.ATMMachine.model.dto.BankDto;

import java.util.List;
import java.util.Optional;

public interface BankService {

    Bank save(Bank bank);
    Optional<BankDto> findBankById(Long id);
    Iterable<Bank> findAllBanks();

}
