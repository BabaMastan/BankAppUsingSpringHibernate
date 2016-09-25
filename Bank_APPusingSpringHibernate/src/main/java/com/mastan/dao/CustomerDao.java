package com.mastan.dao;

import java.util.ArrayList;

import com.mastan.bean.CustomerInfoBean;

public interface CustomerDao {
	public void addcustomer(CustomerInfoBean customer);
	public CustomerInfoBean getcustomer(int accno);
	public CustomerInfoBean getcustomer(String uname);
	public ArrayList<CustomerInfoBean> allcustomer();
	public void deletecustomer(int accno);
	
	

}
