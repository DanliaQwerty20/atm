package com.io.ATMMachine.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "banks")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_code")
    private int bankCode;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "legal_address")
    private String legalAddress;

    @OneToMany(mappedBy = "bank")
    private List<ATM> atms;

    @OneToMany(mappedBy = "bank")
    private List<Client> clients;
}
