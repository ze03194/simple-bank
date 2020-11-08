package com.simplebank.simplebank.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
    @Id
    private String bankName;
    private int numOfUsers;
    private int numOfAccounts;
    private double totalCash;

    public Bank() {
    }

    public Bank(String bankName, int numOfUsers, int numOfAccounts, double totalCash) {
        this.bankName = bankName;
        this.numOfUsers = numOfUsers;
        this.numOfAccounts = numOfAccounts;
        this.totalCash = totalCash;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getNumOfUsers() {
        return numOfUsers;
    }

    public void setNumOfUsers(int numOfUsers) {
        this.numOfUsers = numOfUsers;
    }

    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    public void setNumOfAccounts(int numOfAccounts) {
        this.numOfAccounts = numOfAccounts;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }
}
