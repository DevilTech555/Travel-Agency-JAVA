package com.saarthi.interfacedao;

import java.util.*;
import com.saarathi.beans.Customer;

public interface CustomerInterface {
	public List<Customer> getAllCustomer();
	public Customer getCustomer(int id);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
}
