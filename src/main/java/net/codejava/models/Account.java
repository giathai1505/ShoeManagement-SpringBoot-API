package net.codejava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	private Integer accountId;
	private String accountName;
	private String accountEmail;
	private String accountPassword;
	private String accountAvatar;
	private Boolean accountRole;
	public Account() {
	}
	public Account(Integer accountId, String accountName, String accountEmail, String accountPassword,
			String accountAvatar, Boolean accountRole) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountEmail = accountEmail;
		this.accountPassword = accountPassword;
		this.accountAvatar = accountAvatar;
		this.accountRole = accountRole;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Boolean getAccountRole() {
		return accountRole;
	}
	public void setAccountRole(Boolean accountRole) {
		this.accountRole = accountRole;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountEmail() {
		return accountEmail;
	}
	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public String getAccountAvatar() {
		return accountAvatar;
	}
	public void setAccountAvatar(String accountAvatar) {
		this.accountAvatar = accountAvatar;
	}

	

}
