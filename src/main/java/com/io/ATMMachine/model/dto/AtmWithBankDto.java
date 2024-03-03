package com.io.ATMMachine.model.dto;

public interface AtmWithBankDto {
    int getAtmNumber();
    String getAtmAddress();
    BankDto getBank();
}