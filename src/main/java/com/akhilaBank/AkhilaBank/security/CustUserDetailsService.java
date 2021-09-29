package com.akhilaBank.AkhilaBank.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import com.akhilaBank.AkhilaBank.DAO.CustomerDAO;
import com.akhilaBank.AkhilaBank.models.Customer;

public class CustUserDetailsService implements UserDetailsService{
	
	@Autowired
	private CustomerDAO custDao;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customer customer = custDao.findByEmail(username);
		if(customer == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomerDetails(customer);
	}

}
