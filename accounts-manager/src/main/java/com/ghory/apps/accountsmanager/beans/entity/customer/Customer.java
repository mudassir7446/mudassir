package com.ghory.apps.accountsmanager.beans.entity.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.ghory.apps.accountsmanager.beans.entity.Invoice;

import antlr.collections.List;

/**
 * Entity class to store the customer information
 * @author mudassir
 *
 */
@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "cust_name", nullable = false)
	private String name;
	
	//TODO Address details to be moved to the Address entity later, this way  we will be able to support multiple addresses
	@Column(name = "cust_address",nullable = true)
	private String address;

	@Column(name = "cust_city",nullable = true)
	private String city;
	
	@Column(name="cust_phone",nullable = true)
	private String phone;

	//TODO Move spoc details to party table later
	@Column(name = "cust_spoc",nullable = true)
	private String spoc;
	
	
	@Column(name="cust_type",nullable = false)
	@ColumnDefault("Retailer")
	private String type;
	
	@OneToMany(mappedBy = "customer")
	java.util.List<Invoice> invoices;
}
