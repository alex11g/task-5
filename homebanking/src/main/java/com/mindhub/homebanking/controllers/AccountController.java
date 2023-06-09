package com.mindhub.homebanking.controllers;

import com.mindhub.homebanking.dtos.AccountDTO;
import com.mindhub.homebanking.dtos.ClientDTO;
import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AccountController {



    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping("/api/accounts")
    public List<AccountDTO> getAccount (){
        return accountRepository.findAll()
                .stream()
                .map(account -> new AccountDTO(account))
                .collect(Collectors.toList());
    };


    @RequestMapping("/api/accounts/{id}")
    public AccountDTO getAccount (@PathVariable Long id ){
        return accountRepository.findById(id)
                .map(account -> new AccountDTO(account))
                .orElse(null);
    };
}
