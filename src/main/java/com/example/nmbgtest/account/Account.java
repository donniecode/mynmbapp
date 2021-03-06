package com.example.nmbgtest.account;

import com.example.nmbgtest.entity.Branch;
import com.example.nmbgtest.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts_tbl")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = true, unique = true, length = 11)
    private int accountNumber;

    @Column(name = "dateOfCreation", nullable = true)
    private Date dateOfCreation;

    @Column(name = "currency", nullable = true)
    private String currency;

    @Column(name = "mobileNumber", nullable = true)
    private int mobileNumber;

    @Column(name = "intialBalance", nullable = true)
    private double intialBalance;

    @Column(name = "activeBalance", nullable = true)
    private double activeBalance;

    @Column(name = "debitBalance", nullable = true)
    private double debitBalance;

    @Column(name = "creditBalance", nullable = true)
    private double creditBalance;

    @Column(name = "debitNarration", nullable = true)
    private double debitNarration;

    @Column(name = "creditNarration", nullable = true)
    private double creditNarration;

    @ManyToOne
//    @JoinColumn(name = "account_id", nullable = false, referencedColumnName = "account_id",
//            foreignKey = @ForeignKey(name = "account_FK",
//                    foreignKeyDefinition = "FOREIGN KEY (account_id) REFERENCES notification_type(account_id)"
//            ))
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    private Branch branch;

}
