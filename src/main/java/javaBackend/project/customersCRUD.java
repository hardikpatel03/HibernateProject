package javaBackend.project;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class customersCRUD {


	// delete
	void deleteCustomers(Session session, Transaction tx, int id) {
		Query quary = session.createQuery("delete customers where customerId = :Id");
		quary.setParameter("Id", 5);
		int result = quary.executeUpdate();
		tx.commit();
		if (result == 1) {
			System.out.println(result + " " + "Customers delete");
		} else {
			System.out.println("No Customer found this id" + " " + id);
		}
	}

	void addCustomers(Session session, Transaction tx) {
		session.save(setCustomersObject(5, "Nikhil", "nikhil@gmail.com", 9913227505l));
		tx.commit();
	}

	void updateCustomers(Session session, Transaction tx) {
		session.update(setCustomersObject(6, "vishal", "vishal1@gmail.com", 9913527505l));
		tx.commit();
	}

	// add and update
	customers setCustomersObject(int Id, String name, String email, long mobile) {
		customers newcustomers = new customers();
		newcustomers.setCustomerId(Id);
		newcustomers.setCustomername(name);
		newcustomers.setEmail(email);
		newcustomers.setMobilenumber(mobile);

		return newcustomers;
	}

//single and multiple data

	void getCustomerCall(Session session) {
		ArrayList<customers> customer = getListofAllCustomer(session);

		for (customers cust : customer) {
			PrintCustomersData(cust);
		}
	}

	customers getCustomerById(Session session, int id) {
		customers customers = session.get(customers.class, id);
		return customers;
	}

	void PrintCustomersData(customers customers) {
		System.out.println(customers.getCustomerId() + " " + customers.getCustomername() + " " + customers.getEmail()
				+ " " + customers.getMobilenumber());
	}

	ArrayList<customers> getListofAllCustomer(Session session) {
		ArrayList<customers> customer = (ArrayList<customers>) session.createQuery("from customers").getResultList();
		return customer;
	}

}
