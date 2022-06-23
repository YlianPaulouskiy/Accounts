package edu.github.exersise14.bank;

import edu.github.exersise14.Client;
import edu.github.exersise14.bank.comparators.ClientNotFountException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
public class Bank {

    @Getter
    @Setter
    private String tittle;
    private List<Client> clientList;

    public Bank(String tittle) {
        this.tittle = this.tittle;
        this.clientList = Collections.emptyList();
    }

    public void addClient(Client client) {
        if (client != null) {
            clientList.add(client);
        }
    }

    public Client getClient(String name, int age) {
        for (Client client : clientList) {
            if (client.getName().equals(name) && client.getAge() == age) {
                return client;
            } else {
                throw new ClientNotFountException();
            }
        }
        return null;
    }
}
