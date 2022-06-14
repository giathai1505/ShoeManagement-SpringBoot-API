package net.codejava.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.models.OrderDetail;
import net.codejava.models.ProductRevenue;
import net.codejava.repositories.OrderDetailRepository;


@Service
public class OrderDetailService {
	@Autowired
	private OrderDetailRepository repo;
	
	public List<OrderDetail> listAll() {
		return repo.findAll();
	}
	
	public List<OrderDetail> getOrderDetailByOrderId(Integer orderId) {
		return repo.findByOrderId(orderId);
	}
	
	public List<ProductRevenue> getOrderDetailByListOrderId(Collection<Integer> orderId) {
		return repo.findByListOrderId(orderId);
	} 
	public void save(OrderDetail order_detail) {
		repo.save(order_detail);
	}
	
	public OrderDetail get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
