package com.mastan.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankuserchecking")
public class CustomerInfo implements Serializable{
	
private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@Column(name = "accno")
	private int accno;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "balance")
	private String balance;
	
	@Column(name = "lastvisitedate")
	private Date lastvisiteddate;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public Date getLastvisiteddate() {
		return lastvisiteddate;
	}
	public void setLastvisiteddate(Date lastvisiteddate) {
		this.lastvisiteddate = lastvisiteddate;
	}
	
	
}
