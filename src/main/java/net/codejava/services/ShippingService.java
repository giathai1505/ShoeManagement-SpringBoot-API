package net.codejava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.models.Shipping;
import net.codejava.repositories.ShippingRepository;



@Service
public class ShippingService {
	@Autowired
	private ShippingRepository repo;
	
	public List<Shipping> getAllShippings()
	{
		return repo.findAll();
	}
	public void save(Shipping shipping) {
		repo.save(shipping);
	}
	public Shipping get(Integer id) {
		return repo.findById(id).get();
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
