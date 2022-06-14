package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipping {
	private Integer shippingId;
	private Integer accountId;
	private String shippingName;
	private Integer shippingPhone;
	private String shippingAddress;
	private String shippingEmail;
	private String shippingNote;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
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
	public String getShippingName() {
		return shippingName;
	}
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	public Integer getShippingPhone() {
		return shippingPhone;
	}
	public void setShippingPhone(Integer shippingPhone) {
		this.shippingPhone = shippingPhone;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getShippingEmail() {
		return shippingEmail;
	}
	public void setShippingEmail(String shippingEmail) {
		this.shippingEmail = shippingEmail;
	}
	public String getShippingNote() {
		return shippingNote;
	}
	public void setShippingNote(String shippingNote) {
		this.shippingNote = shippingNote;
	}
	public Shipping(Integer shippingId, Integer accountId, String shippingName, Integer shippingPhone,
			String shippingAddress, String shippingEmail, String shippingNote) {
		super();
		this.shippingId = shippingId;
		this.accountId = accountId;
		this.shippingName = shippingName;
		this.shippingPhone = shippingPhone;
		this.shippingAddress = shippingAddress;
		this.shippingEmail = shippingEmail;
		this.shippingNote = shippingNote;
	}
	public Shipping() {
		
	}
	
	
	
}
