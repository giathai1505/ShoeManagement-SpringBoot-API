package net.codejava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.models.CartDetail;
import net.codejava.repositories.CartDetailRepository;


@Service
public class CartDetailService {
	@Autowired
	private CartDetailRepository repo;
	
	public List<CartDetail> listAll() {
		return repo.findAll();
	}
	
	public List<CartDetail> getCartDetailByAccountId(Integer accountId) {
		return repo.findByAccountId(accountId);
	}
	public Long deleteCartDetailByAccountId(Integer accountId) {
		return repo.deleteByAccountId(accountId);
	}
	public void save(CartDetail cart_detail) {
		repo.save(cart_detail);
	}
	
	public CartDetail get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
