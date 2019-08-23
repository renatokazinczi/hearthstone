package com.fixer.hearthstone.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private Integer accountNumber;
    private String name;
    private String email;
    private String password;
    private BigDecimal balance;
    private LocalDateTime birth;

    public Player(String name, String email, String password, BigDecimal balance, LocalDateTime birth) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.birth = birth;
    }

    public Player() {
        // TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addAmountToBalance(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void subtractAmountToBalance(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Player other = (Player) obj;
        if (accountNumber == null) {
            if (other.accountNumber != null) {
                return false;
            }
        } else if (!accountNumber.equals(other.accountNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player [accountNumber=" + accountNumber + ", name=" + name + ", email=" + email + ", password=" + password + ", balance=" + balance
                + ", birth=" + birth + "]";
    }

}
