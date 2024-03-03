package com.io.ATMMachine.service;


import com.io.ATMMachine.model.ATM;
import com.io.ATMMachine.model.dto.ATMDto;
import com.io.ATMMachine.model.dto.AtmWithBankDto;

import java.util.List;
import java.util.Optional;

public interface AtmService {

    ATM save(ATM atm);
    Optional<ATMDto> findBankById(Long id);
    List<ATM> findAllBanks();

    Optional<ATM> findAtmById(Long id);

    List<ATM> findAllAtms();

    List<ATM> findAtmsByBankCode(int bankCode);

    ATM findAtmByAtmNumber(int atmNumber);

    List<AtmWithBankDto> findAllAtmsWithBank();
}
