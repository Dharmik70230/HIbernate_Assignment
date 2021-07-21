package com.phoenix.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.entities.Product;
/*
 * @author dharmik.maru@stl.in
 * @creation_date 7-Jul-2021
 * @version 2.0
 * @copyright Sterlite Technologies
 * @ description It is a JPQL
 * 				 
 * */
public class JPQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// create configuration object and read configuration
				Configuration cfg = new Configuration().configure();
				// built session factory
				SessionFactory factory = cfg.buildSessionFactory();

				// Establish Database Connection
				Session session = factory.openSession();

				Transaction tx = session.beginTransaction();

				//hibernate query using jpql - object oriented query language
				//works on Persistent Class and it's attributes only
				//does not understand table and column names
				
			Query query = session.createQuery("from Product");
				
//				Query query = session.createQuery("from Product p where p.price >= 34000.00");
	
//				Query query = session.createQuery("from Product p where p.brand = 'Dell'");
				
//				Query query = session.createQuery("from Product p where p.productName = 'Laptop'");
//				Query query = session.createQuery("from Product p  where p.productName = 'Laptop' and p.brand = 'Dell'");
				
//				Query query = session.createQuery("from Product p  where p.price between 5000 and 500000");
//				Query query = session.createQuery("from Product p where p.productName Like 'L%' ");
//				Query query = session.createQuery("from Product p where p.productName Like '_a%' ");
				
//				Query query = session.createQuery("from Product p where p.productName is null ");
				
//				Query query = session.createQuery("from Product p where p.productName is  not null ");
//				Query query = session.createQuery("from Product p order by p.price ");
//				Query query = session.createQuery("from Product p order by p.price desc ");
//				Query query = session.createQuery("from Product p order by  p.productName, p.price desc");
				
			//	Query query = session.createQuery("from Product p.price <=5000.00 , order by  p.price desc");
				
				//Query query = session.createQuery("from Product p.price <=5000.00  and p.brand like '%a%', order by  p.price desc");
//				
			
			List<Product> productList = query.getResultList();
				for(Product product : productList)
				System.out.println(product);
			
				
				
			tx.commit();
			session.close();
	}

}
