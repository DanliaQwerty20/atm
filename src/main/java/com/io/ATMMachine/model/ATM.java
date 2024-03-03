package com.io.ATMMachine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ATMs")
public class ATM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atm_number")
    private int atmNumber;

    @Column(name = "atm_address")
    private String atmAddress;

    @ManyToOne
    @JoinColumn(name = "bank_code")
    private Bank bank;

    @ManyToMany
    private List<Client> clients;

}