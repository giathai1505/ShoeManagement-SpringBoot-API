package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CartDetail {
	private Integer cartDetailId;
	private Integer productId;
	private Integer cartId;
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
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getCartProductQuanity() {
		return cartProductQuanity;
	}
	public void setCartProductQuanity(Integer cartProductQuanity) {
		this.cartProductQuanity = cartProductQuanity;
	}
	public CartDetail() {
	}
	public CartDetail(Integer cartDetailId, Integer productId, Integer cartId, Integer cartProductQuanity) {
		super();
		this.cartDetailId = cartDetailId;
		this.productId = productId;
		this.cartId = cartId;
		this.cartProductQuanity = cartProductQuanity;
	}
	
}
