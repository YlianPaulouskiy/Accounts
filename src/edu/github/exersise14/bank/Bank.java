package edu.github.exersise14.bank;

import edu.github.exersise14.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
public class Bank {

    @Getter
    @Setter
    private String name;

    private List<Client> clientList;

    public Bank(String name, List<Client> clientList) {
        this.name = name;
        this.clientList = clientList;
    }

    
}
