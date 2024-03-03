package com.io.ATMMachine.mapper;

import com.io.ATMMachine.model.Bank;
import com.io.ATMMachine.model.dto.BankDto;
import org.springframework.stereotype.Component;

@Component
public class BankMapper {

    public BankDto mapToDto(Bank bank){
        return BankDto.builder()
                .bankName(bank.getBankName())
                .bankCode(bank.getBankCode())
                .build();
    }

}
