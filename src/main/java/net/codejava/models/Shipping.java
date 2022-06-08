package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipping {
	private Integer Shipping_id;
	private Integer Account_id;
	private String Shipping_name;
	private Integer Shipping_phone;
	private String Shipping_address;
	private String Shipping_email;
	private String Shipping_note;
	
	public Shipping() {
	}

	public Shipping(Integer shipping_id, Integer account_id, String shipping_name, Integer shipping_phone,
			String shipping_address, String shipping_email, String shipping_note) {
		super();
		Shipping_id = shipping_id;
		Account_id = account_id;
		Shipping_name = shipping_name;
		Shipping_phone = shipping_phone;
		Shipping_address = shipping_address;
		Shipping_email = shipping_email;
		Shipping_note = shipping_note;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public String getShipping_name() {
		return Shipping_name;
	}
	public void setShipping_name(String shipping_name) {
		Shipping_name = shipping_name;
	}
	public Integer getShipping_phone() {
		return Shipping_phone;
	}
	public void setShipping_phone(Integer shipping_phone) {
		Shipping_phone = shipping_phone;
	}
	public String getShipping_address() {
		return Shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		Shipping_address = shipping_address;
	}
	public String getShipping_email() {
		return Shipping_email;
	}
	public void setShipping_email(String shipping_email) {
		Shipping_email = shipping_email;
	}
	public String getShipping_note() {
		return Shipping_note;
	}
	public void setShipping_note(String shipping_note) {
		Shipping_note = shipping_note;
	}
}
