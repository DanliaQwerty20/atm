package com.io.ATMMachine.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ATMDto {
    private int atmNumber;
    private String atmAddress;
    private BankDto bank;
}
