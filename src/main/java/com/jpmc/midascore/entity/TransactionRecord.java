package com.jpmc.midascore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TransactionRecord {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private UserRecord sender;

    @ManyToOne
    private UserRecord recipient;

    private float amount;
    private float incentive;
    protected TransactionRecord() {}
    public void setIncentive(float incentive) {
    this.incentive = incentive;
}
    
    public TransactionRecord(UserRecord sender, UserRecord recipient, float amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }
}