package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CartDetail {
	private Integer cartDetailId;
	private Integer productId;
	private Integer accountId;
	private Integer cartProductQuanity;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCartDetailId() {
		return cartDetailId;
	}
	public void setCartDetailId(Integer cartDetailId) {
		this.cartDetailId = cartDetailId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getCartProductQuanity() {
		return cartProductQuanity;
	}
	public void setCartProductQuanity(Integer cartProductQuanity) {
		this.cartProductQuanity = cartProductQuanity;
	}
	public CartDetail() {
	}
	public CartDetail(Integer cartDetailId, Integer productId, Integer accountId, Integer cartProductQuanity) {
		super();
		this.cartDetailId = cartDetailId;
		this.productId = productId;
		this.accountId = accountId;
		this.cartProductQuanity = cartProductQuanity;
	}
	
	
}
