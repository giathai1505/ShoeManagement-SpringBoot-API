package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	private Integer Account_id;
	private String Account_name;
	private String Account_email;
	private String Account_password;
	private String Account_avatar;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAccount_id() {
		return Account_id;
	}
	public Account() {
		
	}
	public Account(Integer account_id, String account_name, String account_email, String account_password,
			String account_avatar) {
		super();
		Account_id = account_id;
		Account_name = account_name;
		Account_email = account_email;
		Account_password = account_password;
		Account_avatar = account_avatar;
	}
	public void setAccount_id(Integer account_id) {
		Account_id = account_id;
	}
	public String getAccount_name() {
		return Account_name;
	}
	public void setAccount_name(String account_name) {
		Account_name = account_name;
	}
	public String getAccount_email() {
		return Account_email;
	}
	public void setAccount_email(String account_email) {
		Account_email = account_email;
	}
	public String getAccount_password() {
		return Account_password;
	}
	public void setAccount_password(String account_password) {
		Account_password = account_password;
	}
	public String getAccount_avatar() {
		return Account_avatar;
	}
	public void setAccount_avatar(String account_avatar) {
		Account_avatar = account_avatar;
	}
	
	

}
