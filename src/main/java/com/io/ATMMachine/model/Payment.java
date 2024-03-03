package com.io.ATMMachine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
//платежи

@Getter
@Entity
@Table(name = "Payment")
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "card_number")
    private Client card_number_client;

    @ManyToOne
    @JoinColumn(name = "atm_number")
    private ATM atm;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "payment_time")
    private Time paymentTime;

    @Column(name = "commission")
    private BigDecimal commission;

    @Column(name = "payment_amount")
    private BigDecimal paymentAmount;
}
