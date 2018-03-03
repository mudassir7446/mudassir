package com.ghory.apps.accountsmanager.beans.vo;

import com.ghory.apps.accountsmanager.beans.entity.Invoice;

public class CustomerVO {

	private Long id;
	
	private String name;
	
	private String address;

	private String city;
	
	private String phone;

	private String spoc;
	
	private String type;
	
	private java.util.List<Invoice> invoices;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public java.util.List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(java.util.List<Invoice> invoices) {
		this.invoices = invoices;
	}

	
}
