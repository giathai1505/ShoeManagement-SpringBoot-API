package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	private Integer Order_id;
	private Integer Shipping_id;
	private Integer Account_id;
	private double Total;
	private Integer Order_status;
	
	public Order() {
	}
	public Order(Integer order_id, Integer shipping_id, Integer account_id, double total, Integer order_status) {
		Order_id = order_id;
		Shipping_id = shipping_id;
		Account_id = account_id;
		Total = total;
		Order_status = order_status;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(Integer order_id) {
		Order_id = order_id;
	}
	public Integer getShipping_id() {
		return Shipping_id;
	}
	public void setShipping_id(Integer shipping_id) {
		Shipping_id = shipping_id;
	}
	public Integer getAccount_id() {
		return Account_id;
	}
	public void setAccount_id(Integer account_id) {
		Account_id = account_id;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public Integer getOrder_status() {
		return Order_status;
	}
	public void setOrder_status(Integer order_status) {
		Order_status = order_status;
	}
	
}
