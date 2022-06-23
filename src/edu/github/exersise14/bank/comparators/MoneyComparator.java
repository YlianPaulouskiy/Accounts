package edu.github.exersise14.bank.comparators;

import edu.github.exersise14.bank.Account;

import java.util.Comparator;

public class MoneyComparator implements Comparator<Account> {

    @Override
    public int compare(Account account1, Account account2) {
        return Integer.compare(account1.getMoney(), account2.getMoney());
    }
}
