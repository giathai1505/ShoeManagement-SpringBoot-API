package net.codejava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.codejava.models.Account;
import net.codejava.repositories.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repo;
	public List<Account> getAllAccounts()
	{
		return repo.findAll();
	}
	
	public Account getAccountById(Integer id) {
		return repo.findById(id).get();
	}

}