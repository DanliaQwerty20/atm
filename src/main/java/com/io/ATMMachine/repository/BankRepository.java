package com.io.ATMMachine.repository;

import com.io.ATMMachine.model.Bank;
import com.io.ATMMachine.model.dto.BankDto;


import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BankRepository {

    Bank save(Bank bank);

    List<Bank> findAll();


    Optional<BankDto> findById(Long id);

}
