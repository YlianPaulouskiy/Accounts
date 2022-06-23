package edu.github.exersise14.bank;

public class BlockAccountException extends RuntimeException{

    public BlockAccountException() {
        this("Operation is impossible. Account blocked");
    }

    public BlockAccountException(String message) {
        super(message);
    }
}
