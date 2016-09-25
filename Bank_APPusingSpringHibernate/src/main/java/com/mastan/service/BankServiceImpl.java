package com.mastan.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mastan.bean.CustomerInfoBean;
import com.mastan.dao.CustomerDao;
import com.mastan.dao.CustomerDaoImpl;



@Service("bankService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BankServiceImpl implements BankService {

	@Autowired
	private CustomerDao customerDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void addcustomer(CustomerInfoBean customer) {
		customerDao.addcustomer(customer);
		
	}

	@Override
	public CustomerInfoBean getcustomer(int accno) {
		
		return customerDao.getcustomer(accno);
	}

	@Override
	public CustomerInfoBean getcustomer(String uname) {
		// TODO Auto-generated method stub
		return customerDao.getcustomer(uname);
	}

	@Override
	public ArrayList<CustomerInfoBean> allcustomer() {
		// TODO Auto-generated method stub
		return customerDao.allcustomer();
	}

	@Override
	public void deletecustomer(int accno) {
		customerDao.deletecustomer(accno);
		
	}

	
}
