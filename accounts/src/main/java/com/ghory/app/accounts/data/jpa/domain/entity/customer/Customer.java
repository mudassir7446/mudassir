package com.ghory.app.accounts.data.jpa.domain.entity.customer;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ghory.app.accounts.data.jpa.domain.entity.Collection;
import com.ghory.app.accounts.data.jpa.domain.entity.Invoice;

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
	
	@OneToMany(mappedBy = "customer")
	private List<Address>addresses;

	@Column(name = "cust_city",nullable = true)
	private String city;
	
	@Column(name="cust_phone",nullable = true)
	private String phone;

	//TODO Move spoc details to party table later
	@Column(name = "cust_spoc",nullable = true)
	private String spoc;
	
	
	@Column(name="cust_type",nullable = false)
	private String type;
	
	@OneToMany(mappedBy = "customer")
	List<Invoice> invoices;
	
	@OneToMany(mappedBy = "customer")
	List<Collection> collection;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return addresses;
	}

	public void setAddress(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpoc() {
		return spoc;
	}

	public void setSpoc(String spoc) {
		this.spoc = spoc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	
}
