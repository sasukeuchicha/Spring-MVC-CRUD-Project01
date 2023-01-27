package customerCRUDMiniProject.Models;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/

/*
 * @Entity
 * 
 * @Table(name="customers") public class Customer {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.SEQUENCE)
 * 
 * @Column(name = "customer_id") private int customerId;
 * 
 * @Column(name = "customer_name") private String customerName;
 * 
 * @Column(name = "customer_number")
 */

public class Customer {
	private int customerId;
	private String customerName;
	private String customerPhoneNumber;
	public Customer(int customerId, String customerName, String customerPhoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getcustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setcustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
}
