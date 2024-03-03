package com.io.ATMMachine.model.dto.impl;

import com.io.ATMMachine.model.dto.AtmWithBankDto;
import com.io.ATMMachine.model.dto.BankDto;

public class AtmWithBankDtoImpl implements AtmWithBankDto {
    private int atmNumber;
    private String atmAddress;
    private BankDto bank;

    public AtmWithBankDtoImpl(int atmNumber, String atmAddress, BankDto bank) {
        this.atmNumber = atmNumber;
        this.atmAddress = atmAddress;
        this.bank = bank;
    }

    @Override
    public int getAtmNumber() {
        return atmNumber;
    }

    @Override
    public String getAtmAddress() {
        return atmAddress;
    }

    @Override
    public BankDto getBank() {
        return bank;
    }
}