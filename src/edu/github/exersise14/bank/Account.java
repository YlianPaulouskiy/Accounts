package edu.github.exersise14.bank;


import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Random;

@NoArgsConstructor
@Getter
public class Account implements Comparable<Account> {


    private final String accountNumber = "";
    private int money;
    private boolean isBlocked;

    public Account(int money) {
        Random random = new Random();
        for (int i = 0; i < 13; i++) {
            accountNumber.concat(String.valueOf(random.nextInt(10)));
        }
        this.money = money;
        this.isBlocked = false;
    }

    public void addMoney(int money) {
        if (!isBlocked) {
            this.money += money;
        } else {
            throw new BlockAccountException();
        }
    }

    public int withdrawMoney(int money) {
        if (!isBlocked) {
            if (this.money > money) {
                return money;
            } else {
                throw new InsufficientFundsException();
            }
        } else {
            throw new BlockAccountException();
        }
    }

    public void blockUnBlockAccount() {
        this.isBlocked = !isBlocked;
    }

    @Override
    public int compareTo(Account account) {
        return accountNumber.compareTo(account.accountNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return money == account.money && isBlocked == account.isBlocked && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, money, isBlocked);
    }
}
