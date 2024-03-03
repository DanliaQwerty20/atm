package com.io.ATMMachine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cards")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private int cardId;

    @Column(name = "card_number")
    private int cardNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "card_type")
    private CardType cardType;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    public enum CardType {
        DEBIT,
        CREDIT,
        PREPAID
    }
}

