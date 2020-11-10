package zach.springframework.simplebank.Bank.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import zach.springframework.simplebank.User.models.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BANK_TABLE")
public class Bank {
    @Id
    @Column(name = "bank_id")
    private String bankName;
    private int numOfUsers;
    private int numOfAccounts;
    private double totalCash;


    @ManyToMany(mappedBy = "banks")
    @JsonIgnore
    private List<User> users;

    public Bank() {
    }

    public Bank(String bankName, int numOfUsers, int numOfAccounts, double totalCash) {
        this.bankName = bankName;
        this.numOfUsers = numOfUsers;
        this.numOfAccounts = numOfAccounts;
        this.totalCash = totalCash;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
        this.numOfUsers++;
        this.totalCash += user.getBalance();
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
