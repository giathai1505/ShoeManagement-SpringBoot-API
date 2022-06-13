package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	private Integer Product_id;
	private String Product_name;
	private Integer Category_id;
	private double Product_price;
	private String Product_img;
	private Integer Product_quanity;
	private Integer Product_status;
	private String Product_desc;
	
	public Product() {
	}
	
	public Product(Integer product_id, String product_name, Integer category_id, double product_price,
			String product_img, Integer product_quanity, Integer product_status, String product_desc) {
		super();
		Product_id = product_id;
		Product_name = product_name;
		Category_id = category_id;
		Product_price = product_price;
		Product_img = product_img;
		Product_quanity = product_quanity;
		Product_status = product_status;
		Product_desc = product_desc;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public Integer getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(Integer product_id) {
		Product_id = product_id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public Integer getCategory_id() {
		return Category_id;
	}
	public void setCategory_id(Integer category_id) {
		Category_id = category_id;
	}
	public double getProduct_price() {
		return Product_price;
	}
	public void setProduct_price(double product_price) {
		Product_price = product_price;
	}
	public String getProduct_img() {
		return Product_img;
	}
	public void setProduct_img(String product_img) {
		Product_img = product_img;
	}
	public Integer getProduct_quanity() {
		return Product_quanity;
	}
	public void setProduct_quanity(Integer product_quanity) {
		Product_quanity = product_quanity;
	}
	public Integer getProduct_status() {
		return Product_status;
	}
	public void setProduct_status(Integer product_status) {
		Product_status = product_status;
	}
	public String getProduct_desc() {
		return Product_desc;
	}
	public void setProduct_desc(String product_desc) {
		Product_desc = product_desc;
	}
	
	
	
}
