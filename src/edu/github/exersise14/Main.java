package edu.github.exersise14;

import edu.github.exersise14.bank.Account;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Max", 43);

        Account account1 = new Account(3333);
        Account account2 = new Account(-2333);
        Account account3 = new Account(-6433);
        Account account4 = new Account(12803);

        client1.addAccount(account1, account2, account3, account4);
        
        client1.blockUnBlockAccount(account1);
        //search account
        System.out.println(client1.searchAccount(account1.getAccountNumber()));
        //sorted
        System.out.println(client1.sortAccountByMoney());
        //getAllSum
        System.out.println(client1.getSumFromAllAccounts());
        //getSumFromNegative
        System.out.println(client1.getSumFromNegativeAccounts());
        //getSumFromPositive
        System.out.println(client1.getSumFromPositiveAccounts());

    }
}
