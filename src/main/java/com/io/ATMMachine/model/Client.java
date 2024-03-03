package com.io.ATMMachine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Entity
@Table(name = "Clients")
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_number")
    private int cardNumber;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_address")
    private String clientAddress;

    @ManyToOne
    @JoinColumn(name = "bank_code")
    private Bank bank;

    //платежи
    @OneToMany
    @JoinColumn(name = "payments")
    private List<Payment> payments;

    @Enumerated(EnumType.STRING)
    @Column(name = "card_type")
    private CardType cardType;
    @OneToMany
    @JoinColumn(name = "withdrawal")
    private List<Withdrawal> withdrawal;
    @ManyToMany
    @JoinColumn(name = "atms")
    private List<ATM> atms;

    @OneToMany
    @JoinColumn(name = "cards")
    private List<Card> cards;
    @OneToOne
    private Token token;

    public enum CardType {
        DEBIT,
        CREDIT,
        PREPAID
    }
}
