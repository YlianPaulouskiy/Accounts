package edu.github.exersise14;

import edu.github.exersise14.bank.Account;
import edu.github.exersise14.bank.AccountNumberException;
import edu.github.exersise14.bank.comparators.MoneyComparator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor
public class Client {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int age;

    private List<Account> accountList;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
        accountList = new ArrayList<>();
    }

    public void addAccount(Account ...accounts) {
        if (accounts!= null) {
            Collections.addAll(accountList, accounts);
        }
    }


    public void blockUnBlockAccount(Account account) {
        account.blockUnBlockAccount();
    }

    public Account searchAccount(String accountNumber) {
        Pattern pattern = Pattern.compile("\\d{13}");
        Matcher matcher = pattern.matcher(accountNumber);
        if (matcher.matches()) {
            for (Account account : accountList) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account;
                }
            }
        } else {
            throw new AccountNumberException();
        }
        return null;
    }

    public List<Account> sortAccountByMoney() {
        List<Account> sortedAccount = this.accountList;
        sortedAccount.sort(new MoneyComparator());
        return sortedAccount;
    }

    public long getSumFromAllAccounts() {
        return accountList.stream().mapToInt(Account::getMoney).sum();
    }

    public long getSumFromPositiveAccounts() {
        return accountList.stream().filter(account -> account.getMoney() > 0).mapToInt(Account::getMoney).sum();
    }

    public long getSumFromNegativeAccounts() {
        return accountList.stream().filter(account -> account.getMoney() < 0).mapToInt(Account::getMoney).sum();
    }

    @Override
    public String toString() {
        return "Client " +
                "name: " + name +
                ", age = " + age +
                ", accountList: " + accountList + "\n";
    }
}
