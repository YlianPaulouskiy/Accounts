package edu.github.exersise14.bank;

public class ClientNotFoundException extends RuntimeException {

    public ClientNotFoundException() {
        this("Client not Found");
    }

    public ClientNotFoundException(String message) {
        super(message);
    }
}
