package edu.github.exersise14.bank;

public class AccountNumberException extends RuntimeException {

    public AccountNumberException() {
        this("Неверно введен номер счета");
    }

    public AccountNumberException(String message) {
        super(message);
    }
}
