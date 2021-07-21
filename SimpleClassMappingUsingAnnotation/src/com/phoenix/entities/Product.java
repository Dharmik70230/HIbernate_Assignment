package com.phoenix.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author dharmik.maru@stl.in
 * @creation_date 7-Jul-2021
 * @version 2.0
 * @copyright Sterlite Technologies
 * @ description It is a POJO class
 * 				 Which acts as Persistent Class
 * 				 or Entity Class in Hibernate.
 * 				It Uses JPA Annotations 
 * */
@Entity
// use when table name or class name are not same 
@Table(name = "product")
public class Product {

		//attributes or instance variables
		@Id
		@Column(name = "id")
	
		private int productId;
		
		@Column(name = "name")
	    private String productName;
	//optional
		@Column(name = "brand")
		private String brand;
		//optional
		@Column(name = "price")
		private float price;
		
		public Product() {
			
		}
		public Product(int productId, String productName, String brand, float price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.brand = brand;
			this.price = price;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", price="
					+ price + "]";
		}

		
		
}
