package edu.github.exersise14.bank;

public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException() {
        this("insufficient funds to complete the operation");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
