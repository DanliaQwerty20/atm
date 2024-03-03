package com.io.ATMMachine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

//опреации по карте
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Withdrawals")
public class Withdrawal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "card_number")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "atm_number")
    private ATM atm;

    @Column(name = "withdrawal_date")
    private Date withdrawalDate;

    @Column(name = "withdrawal_time")
    private Time withdrawalTime;

    @Column(name = "commission")
    private boolean commission;

    @Column(name = "withdrawal_amount")
    private BigDecimal withdrawalAmount;
}