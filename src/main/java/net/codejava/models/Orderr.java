package net.codejava.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orderr {
	private Integer orderId;
	private Integer shippingId;
	private Integer accountId;
	private double total;
	private Integer orderStatus;
	private LocalDate orderDate;
	public Orderr() {
	}
	public Orderr(Integer orderId, Integer shippingId, Integer accountId, double total, Integer orderStatus,
			LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.shippingId = shippingId;
		this.accountId = accountId;
		this.total = total;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getShippingId() {
		return shippingId;
	}
	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
	
	
	
}
