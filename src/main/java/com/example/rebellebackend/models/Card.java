package com.example.rebellebackend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue
    private long id;

    private String paySystem;

    private long cardNumber;

    private long cardDate;

    private long cardCVV;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
