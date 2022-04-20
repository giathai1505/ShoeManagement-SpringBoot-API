package net.codejava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.models.Test;
import net.codejava.repositories.TestRepository;

@Service
public class TestService {
	@Autowired
	private TestRepository repo;
	
	public List<Test> getAll()
	{
		return repo.findAll();
	}

}
