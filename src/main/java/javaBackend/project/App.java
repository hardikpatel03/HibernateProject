package javaBackend.project;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		
		// to get product list
		// getAllProduct(session);

		// to get product by id
//		product p=session.get(product.class, 1);
//		printProduct(p);
		// System.out.println(p.toString());

		// to add a product
//		product p = createProductObj(4, "legion", 22000, 2);
//		addProduct(p, session, tx);

		// to update product
	//	updateProduct(session, tx);

		// to delete product
		//deleteProduct(session, tx, 2);
	}

	static void deleteProduct(Session session, Transaction tx, int id) {
		Query quary = session.createQuery("delete customers where id = :Id");
		quary.setParameter("Id", id);
		int result = quary.executeUpdate();
		tx.commit();
		if (result == 1) {
			System.out.println(result + " " + "product delete");
		} else {
			System.out.println("No product found this id" + " " + id);
		}
	}

	static void updateProduct(Session s, Transaction tx) {
		product p = createProductObj(2, "Idea pad II", 15000, 2);
		s.update(p);
		tx.commit();
	}

	static void getAllProduct(Session s) {
		ArrayList<product> productList = (ArrayList<product>) s.createQuery("from product").getResultList();

		for (product prod : productList) {
			printProduct(prod);
		}
	}

	
	static void addProduct(product p, Session s, Transaction tx) {
		s.save(p);
		//s.save(createProductObj(5, "legion", 30000, 4));
		tx.commit();
	}

	static product createProductObj(int id, String name, int price, int quantity) {
		product p = new product();
		p.setId(id);
		p.setProductName(name);
		p.setPrice(price);
		p.setQuantity(quantity);

		return p;
	}

	static void printProduct(product p) {
		 System.out.println(p.toString());
	//	System.out.println(p.getId() + " " + p.getProductName() + " " + p.getPrice() + " " + p.getQuantity());
	}
}
		// customers--------------------------
//
//		Configuration cfg = new Configuration();
//		cfg.configure();
//
//		SessionFactory factory = cfg.buildSessionFactory();
//		Session session = factory.openSession();
//
//		Transaction tx = session.beginTransaction();
//
//		 customersCRUD cust=new customersCRUD();
//		// to get list of all customers
//	cust.getCustomerCall(session);

		// to get data single user by id
//		 customers customers = cust.getCustomerById(session, 1);
//		 cust.PrintCustomersData(customers);

		// create data
//		 cust.addCustomers(session,tx);
		
		// session.save(setCustomersObject(0, null, null, 0));
		 //tx.commit();

		// update data
//		cust.updateCustomers(session, tx);
		
//		//session.update(setCustomersObject(0, null, null, 0));
//		tx.commit();

		// delete data
//		 cust.deleteCustomers(session,tx,8);

//	}
//}
// delete
//	static void deleteCustomers(Session session, Transaction tx, int id) {
//		Query quary = session.createQuery("delete customers where customerId = :Id");
//		quary.setParameter("Id", 5);
//		int result = quary.executeUpdate();
//		tx.commit();
//		if (result == 1) {
//			System.out.println(result + " " + "Customers delete");
//		} else {
//			System.out.println("No Customer found this id" + " " + id);
//		}
//	}
//
//	static void addCustomers(Session session, Transaction tx) {
//		session.save(setCustomersObject(11, "Nikhil", "nikhil@gmail.com", 9913227505l));
//		tx.commit();
//	}
//
//	static void updateCustomers(Session session, Transaction tx) {
//		session.update(setCustomersObject(6, "vishal", "vishal@gmail.com", 9913527505l));
//		tx.commit();
//	}
//
//	// add and update
//	static customers setCustomersObject(int Id, String name, String email, long mobile) {
//		customers newcustomers = new customers();
//		newcustomers.setCustomerId(Id);
//		newcustomers.setCustomername(name);
//		newcustomers.setEmail(email);
//		newcustomers.setMobilenumber(mobile);
//
//		return newcustomers;
//	}
//
////single and multiple data
//	static void getCustomerCall(Session session) {
//		ArrayList<customers> customer = getListofAllCustomer(session);
//
//		for (customers cust : customer) {
//			PrintCustomersData(cust);
//		}
//	}
//
//	static customers getCustomerById(Session session, int id) {
//		customers customers = session.get(customers.class, id);
//		return customers;
//	}
//
//	static void PrintCustomersData(customers customers) {
//		System.out.println(customers.getCustomerId() + " " + customers.getCustomername() + " " + customers.getEmail()
//				+ " " + customers.getMobilenumber());
//	}
//
//	static ArrayList<customers> getListofAllCustomer(Session session) {
//		ArrayList<customers> customer = (ArrayList<customers>) session.createQuery("from customers").getResultList();
//		return customer;
//	}
//}
