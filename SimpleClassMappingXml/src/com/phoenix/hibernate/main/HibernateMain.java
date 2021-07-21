package com.phoenix.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.entities.Product;

/*
 * @author dharmik.maru@stl.in
 * @creation_date 7-Jul-2021
 * @version 1.0
 * @copyright Sterlight Technologies
 * @ description It is used to perfrom
 * 						database operation using hibernate freamework			 
 * */
public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create configuration object and read configuration
		Configuration cfg = new Configuration();
		// built session factory
		SessionFactory factory = cfg.buildSessionFactory();

		// Establish Database Connection
		Session ss = factory.openSession();

		// Obtain hibernate Transaction
		Transaction tx = ss.beginTransaction();
		
		//code for databse operations
		
		//get database row as an object
//		Product product = ss.get(Product.class, 2);
//		System.out.println(product);
		
		//insert a row
		//Product p = new Product(7,"Mobile","MI",10000f);
		//ss.save(p);
		
		
		/*
		 * Product p = ss.load(Product.class,2); System.out.println("Product ID : " +
		 * p.getProductId()); System.out.println("Product Name : " +
		 * p.getProductName()); System.out.println("Product Brand : " + p.getBrand());
		 * System.out.println("Product Price : " + p.getPrice());
		 */
		
		//update row
		/*
		 * Product p = ss.get(Product.class, 2); if(p!=null) { p.setPrice(p.getPrice() +
		 * 17000.00f); ss.update(p); }else {
		 * System.out.println("Sorry! Product not Found"); } p = ss.get(Product.class,
		 * 2); if(p!=null) { ss.update(p); }else {
		 * System.out.println("Sorry! Product not Found"); }
		 */
		
		//delete a row using a obj
		Product p = ss.get(Product.class,7);
		if(p!=null) {
			ss.delete(p);
		}else {
			 System.out.println("Sorry! Product not Found");
		}
		// commit transaction
		tx.commit();
		
		// close session
		ss.close();
	}

}
