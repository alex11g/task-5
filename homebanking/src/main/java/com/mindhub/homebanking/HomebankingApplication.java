package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.models.TransactionType;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import com.mindhub.homebanking.repositories.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}



	@Bean
	public CommandLineRunner initData(ClientRepository repository, AccountRepository repository2, TransactionRepository repository3) {
		return (args) -> {
			// save a couple of customers
			Client client1 = new Client("Melba", "melba@mindhub.com","Morel");
			repository.save(client1);
			Client client2 = new Client("Andres", "Andres@mindhub.com","Rey");
			repository.save(client2);
			Account account1 = new Account("VIN001", 5000.0,LocalDateTime.now());
			client1.addAccount(account1);
			repository2.save(account1);
			Account account2= new Account("VIN002", 7500.0, LocalDateTime.now().plusDays(1));
			client1.addAccount(account2);
			repository2.save(account2);
			Account account3 = new Account("VIN003", 500000.0,LocalDateTime.now() );
			client2.addAccount(account3);
			repository2.save(account3);
			Account account4= new Account("VIN004", 750000.0, LocalDateTime.now().plusDays(1));
			client2.addAccount(account4);
			repository2.save(account4);


			Transaction transaction1 = new Transaction(TransactionType.DEBIT, 3021.00,"online-pages", LocalDateTime.now());
			account1.addTransaction(transaction1);
			repository3.save(transaction1);
			Transaction transaction2 = new Transaction(TransactionType.CREDIT, 111.00,"online-pages",LocalDateTime.now());
			account2.addTransaction(transaction2);
			repository3.save(transaction2);

			Transaction transaction3 = new Transaction(TransactionType.DEBIT, 3000212.00,"free games", LocalDateTime.now());
			account3.addTransaction(transaction3);
			repository3.save(transaction3);
			Transaction transaction4 = new Transaction(TransactionType.CREDIT, 3.00,"free games",LocalDateTime.now());
			account4.addTransaction(transaction4);
			repository3.save(transaction4);

		};
	}


}
