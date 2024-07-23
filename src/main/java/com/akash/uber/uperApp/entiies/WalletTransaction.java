package com.akash.uber.uperApp.entiies;

import com.akash.uber.uperApp.entiies.enums.TransactionMethod;
import com.akash.uber.uperApp.entiies.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private TransactionMethod transactionMethod;

    @CreationTimestamp
    private LocalDateTime transactionTime;

    @ManyToOne
    private Wallet wallet;

    @OneToOne
    private Ride ride;

    private String transactionId;

}
