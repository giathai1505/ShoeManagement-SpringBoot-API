package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetail {
	private Integer orderDetailId;
	private Integer productId;
	private Integer orderId;
	private Integer productQuanity;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getProductQuanity() {
		return productQuanity;
	}
	public void setProductQuanity(Integer productQuanity) {
		this.productQuanity = productQuanity;
	}
	public OrderDetail() {
	}
	public OrderDetail(Integer orderDetailId, Integer productId, Integer orderId, Integer productQuanity) {
		super();
		this.orderDetailId = orderDetailId;
		this.productId = productId;
		this.orderId = orderId;
		this.productQuanity = productQuanity;
	}
	
	
	
}
