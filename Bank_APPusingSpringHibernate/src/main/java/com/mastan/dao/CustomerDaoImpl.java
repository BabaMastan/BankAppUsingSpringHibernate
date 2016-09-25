package com.mastan.dao;

import java.util.ArrayList;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mastan.bean.CustomerInfoBean;
@Repository("customerDao")

public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addcustomer(CustomerInfoBean customer) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		
		
	}

	@Override
	public CustomerInfoBean getcustomer(int accno) {
		return (CustomerInfoBean) sessionFactory.getCurrentSession().get(CustomerInfoBean.class, accno);
	}

	@Override
	public CustomerInfoBean getcustomer(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<CustomerInfoBean> allcustomer() {
		// TODO Auto-generated method stub
		return  (ArrayList<CustomerInfoBean>) sessionFactory.getCurrentSession().createCriteria(CustomerInfoBean.class).list();
	}
	@Override
	public void deletecustomer(int accno) {
		
		sessionFactory.getCurrentSession().createQuery("DELETE FROM bankcustomerchecking WHERE accno = "+accno).executeUpdate();
	}

}
