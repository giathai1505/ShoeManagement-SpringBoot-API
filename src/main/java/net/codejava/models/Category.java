package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	private Integer Category_id;
	private String Category_name;
	private Integer Category_status;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCategory_id() {
		return Category_id;
	}
	public void setCategory_id(Integer category_id) {
		Category_id = category_id;
	}
	public String getCategory_name() {
		return Category_name;
	}
	public void setCategory_name(String category_name) {
		Category_name = category_name;
	}
	public Integer getCategory_status() {
		return Category_status;
	}
	public void setCategory_status(Integer category_status) {
		Category_status = category_status;
	}
	public Category(Integer category_id, String category_name, Integer category_status) {
		super();
		Category_id = category_id;
		Category_name = category_name;
		Category_status = category_status;
	}
	public Category() {
		
	}
	

}
