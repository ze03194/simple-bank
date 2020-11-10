package zach.springframework.simplebank.User.models;

import zach.springframework.simplebank.Bank.models.Bank;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER_TABLE")
public class User {
    @Id
    @Column(name = "user_id")
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String securityPin;
    private String dateOfBirth;
    private double balance = 0;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinTable(name = "user_bank",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "bank_id")
    )
    private List<Bank> banks;

    public User() {
        this.balance = 0;
    }

    public User(String userName, String firstName, String lastName, String password, String securityPin, String dateOfBirth, double balance) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.securityPin = securityPin;
        this.dateOfBirth = dateOfBirth;
        this.balance = balance;
    }

    public void addBank(Bank bank){
        banks.add(bank);
    }

    public List<Bank> getBanks() {
        return banks;
    }

    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityPin() {
        return securityPin;
    }

    public void setSecurityPin(String securityPin) {
        this.securityPin = securityPin;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
