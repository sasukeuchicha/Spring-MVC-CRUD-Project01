package customerCRUDMiniProject.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import customerCRUDMiniProject.Models.Customer;


@Component
public class CustomerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//create customer
	@Transactional
	public int addCustomer(Customer customer) {
		Integer i = (Integer) this.hibernateTemplate.save(customer);
		
		return i;
	}
	//get all customers
	public List<Customer> getAllCustomers(){
		List<Customer> customers = this.hibernateTemplate.loadAll(Customer.class);
		
		return customers;
	}
	//get one customer
	public Customer getCusomter(int customerId) {
		Customer customer = this.hibernateTemplate.get(Customer.class, customerId);
		
		return customer;
	}
	//delete
	@Transactional
	public String deleteCusomter(int customerId) {
		try {
		Customer customer = this.hibernateTemplate.get(Customer.class, customerId);

		this.hibernateTemplate.delete(customer);
		return "Delete successfull";
		}
		catch(DataAccessException e) {
			return "The customer data is not found to delete it";
		}

	}
	@Transactional
	public String deleteCusomter(Customer customer) {
		try {
		this.hibernateTemplate.delete(customer);
		return "Delete successfull";
		}
		catch(DataAccessException e) {
			return "The customer data is not found to delete it";
		}
		
	}
	
	//update
	public int updateCustomer(Customer customer){
		String message = this.deleteCusomter(customer.getCustomerId());
		message = message+".";
		int i = this.addCustomer(customer);
		return i;
	}
	
}
