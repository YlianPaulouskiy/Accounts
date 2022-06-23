package edu.github.exersise14.bank;

import edu.github.exersise14.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
public class Bank {

    @Getter
    @Setter
    private String tittle;

    private List<Client> clientList;

    public Bank(String tittle, List<Client> clientList) {
        this.tittle = tittle;
        this.clientList = clientList;
    }

    public Bank(String tittle) {
        this.tittle = tittle;
        this.clientList = new ArrayList<>();
    }

    public void addClient(Client ...clients) {
        if (clients != null) {
            Collections.addAll(clientList, clients);
        }
    }


    public Client getClient(String name, int age) {
        for (Client client : clientList) {
            if (client.getName().equals(name) && client.getAge() == age) {
                return client;
            } else {
                throw new ClientNotFoundException();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                ", tittle='" + tittle  +
                ", clientList=" + clientList;
    }
}

