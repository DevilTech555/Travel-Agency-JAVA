package com.saarathi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.saarathi.ConnectionProvider;
import com.saarathi.beans.Customer;
import com.saarthi.interfacedao.CustomerInterface;

public class CustomerDAO implements CustomerInterface {
	List<Customer> customer;
	
	public CustomerDAO() throws SQLException {
		String sql = "";
		ResultSet rs = ConnectionProvider.getConnectionProvider().createStatement().executeQuery(sql);
	}

	@Override
	public List<Customer> getAllCustomer() {

		return null;
	}

	@Override
	public Customer getCustomer(int id) {

		return null;
	}

	@Override
	public void updateCustomer(Customer customer) {
		
	}

	@Override
	public void deleteCustomer(Customer customer) {

	}

}
