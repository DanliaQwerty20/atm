package com.io.ATMMachine.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankDto {


    @Column(name = "bank_code")
    private int bankCode;
    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "legal_address")
    private String legalAddress;
}
