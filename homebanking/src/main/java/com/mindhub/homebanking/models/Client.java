package com.mindhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String name;
    private String email;
    private String lastName;

    @OneToMany(mappedBy = "client")
    private Set<Account> accounts = new HashSet<>();
    public Client() {
    }

    public Client(String name, String email, String lastName) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
    }


    public void addAccount(Account account) {
        account.setClient(this);
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }


    public Set<Account> getAccounts() {
        return accounts;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", accounts=" + accounts +
                '}';
    }
}

