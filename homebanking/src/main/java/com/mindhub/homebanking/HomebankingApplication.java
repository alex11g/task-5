package com.mindhub.homebanking;

import com.mindhub.homebanking.models.*;
import com.mindhub.homebanking.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}



	@Bean
	public CommandLineRunner initData(ClientRepository repositoryCliente, AccountRepository repositoryAccount, TransactionRepository repositoryTransaction, LoanRepository repositoryLoan, ClientLoanRepository clientLoanRepository) {
		return (args) -> {
			// save a couple of customers
			Client client1 = new Client("Melba", "melba@mindhub.com","Morel");
			repositoryCliente.save(client1);
			Client client2 = new Client("Andres", "Andres@mindhub.com","Rey");
			repositoryCliente.save(client2);
			Account account1 = new Account("VIN001", 5000.0,LocalDateTime.now());
			client1.addAccount(account1);
			repositoryAccount.save(account1);
			Account account2= new Account("VIN002", 7500.0, LocalDateTime.now().plusDays(1));
			client1.addAccount(account2);
			repositoryAccount.save(account2);
			Account account3 = new Account("VIN003", 500000.0,LocalDateTime.now() );
			client2.addAccount(account3);
			repositoryAccount.save(account3);
			Account account4= new Account("VIN004", 750000.0, LocalDateTime.now().plusDays(1));
			client2.addAccount(account4);
			repositoryAccount.save(account4);


			Transaction transaction1 = new Transaction(TransactionType.DEBIT, 3021.00,"online-pages", LocalDateTime.now());
			account1.addTransaction(transaction1);
			repositoryTransaction.save(transaction1);
			Transaction transaction2 = new Transaction(TransactionType.CREDIT, 111.00,"online-pages",LocalDateTime.now());
			account2.addTransaction(transaction2);
			repositoryTransaction.save(transaction2);

			Transaction transaction3 = new Transaction(TransactionType.DEBIT, 3000212.00,"free games", LocalDateTime.now());
			account3.addTransaction(transaction3);
			repositoryTransaction.save(transaction3);
			Transaction transaction4 = new Transaction(TransactionType.CREDIT, 3.00,"free games",LocalDateTime.now());
			account4.addTransaction(transaction4);
			repositoryTransaction.save(transaction4);

			Loan loan1= new Loan("MORTGAGE", 500000,List.of(12,24,36,48,60));
			repositoryLoan.save(loan1);
			Loan loan2= new Loan("STAFF", 100000,List.of(6,12,24));
			repositoryLoan.save(loan2);
			Loan loan3= new Loan("AUTOMOTIVE", 300000,List.of(6,12,24,36));
			repositoryLoan.save(loan3);

			ClientLoan clientLoan1= new ClientLoan("MORTGAGE",400.000,60);
			client1.addClientLoan(clientLoan1);
			loan1.addClientLoan(clientLoan1);
			clientLoanRepository.save(clientLoan1);

			ClientLoan clientLoan2= new ClientLoan("STAFF",50.000,12);
			client1.addClientLoan(clientLoan2);
			loan2.addClientLoan(clientLoan2);
			clientLoanRepository.save(clientLoan2);

			ClientLoan clientLoan3= new ClientLoan("STAFF",100.000,24);
			client2.addClientLoan(clientLoan3);
			loan2.addClientLoan(clientLoan3);
			clientLoanRepository.save(clientLoan3);

			ClientLoan clientLoan4= new ClientLoan("Automotive",200.000,36);
			client2.addClientLoan(clientLoan4);
			loan3.addClientLoan(clientLoan4);
			clientLoanRepository.save(clientLoan4);



		};
	}


}
