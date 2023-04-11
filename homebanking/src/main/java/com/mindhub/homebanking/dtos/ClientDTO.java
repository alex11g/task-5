package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ClientDTO {
    private long id;
    private String name;
    private String email;
    private String lastName;

    private Set<AccountDTO> accountDTOS;


    public ClientDTO() {
    }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.email = client.getEmail();
        this.lastName = client.getLastName();
        this.accountDTOS = client.getAccounts().stream().map(account -> new AccountDTO(account)).collect(Collectors.toSet());
    }


    public long getId() {
        return id;
    }

    public Set<AccountDTO> getAccountDTOS() {
        return accountDTOS;
    }

    public String getName() {
        return name;
    }



    public String getEmail() {
        return email;
    }


    public String getLastName() {
        return lastName;
    }

}
