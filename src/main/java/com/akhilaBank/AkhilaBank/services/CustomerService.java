package com.akhilaBank.AkhilaBank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhilaBank.AkhilaBank.DAO.CustomerDAO;
//import com.akhilaBank.AkhilaBank.DAO.HistoryDAO;
import com.akhilaBank.AkhilaBank.models.Customer;
//import com.akhilaBank.AkhilaBank.models.TransferHistory;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;
	
	
	public Customer AddCustomer(Customer customer) {
		
		Customer addCustomer = customerDao.save(customer);
		
		return addCustomer;
	}
	
	public Customer getCustomerDetails(String email) {
		return customerDao.findByEmail(email);
	}

}

