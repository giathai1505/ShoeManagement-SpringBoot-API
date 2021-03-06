package net.codejava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.models.Orderr;
import net.codejava.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;
	
	public List<Orderr> listAll() {
		return repo.findAll();
	}
	public List<Orderr> listAllOrderByAccountId(Integer accountId) {
		return repo.findByAccountId(accountId);
	}
	public Orderr save(Orderr order) {
		return repo.save(order);
	}
	
	public Orderr get(Integer id) {
		return repo.findById(id).get();
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
