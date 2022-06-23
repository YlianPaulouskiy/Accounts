package edu.github.exersise14.bank.comparators;

public class ClientNotFountException extends RuntimeException {

    public ClientNotFountException() {
        this("Client not Found");
    }

    public ClientNotFountException(String message) {
        super(message);
    }
}
