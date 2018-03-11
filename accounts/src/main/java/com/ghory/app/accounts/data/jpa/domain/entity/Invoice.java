package com.ghory.app.accounts.data.jpa.domain.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ghory.app.accounts.data.jpa.domain.entity.customer.Customer;


/**
 * Entity class to map the invoice entity
 * @author mudassir
 *
 */


@Entity
@Table(name = "invoice")
public class Invoice {

	/**
	 * Autoincrement Identifier
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "invoice_number")
	private String number;
	
	@Column(name = "invoice_date")
	private Timestamp dateTime;

	@Column(name = "invoice_issuer")
	private String issuer;

	@Column(name = "invoice_roundedoff")
	private float roundedOff;
	
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "invoice_customer_id",nullable = true)
	private Customer customer;
	
	@OneToMany(mappedBy = "invoice")
	private List<Item> items;
	
	@ManyToMany(mappedBy = "invoices")
	private List<Collection>collections;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public float getRoundedOff() {
		return roundedOff;
	}

	public void setRoundedOff(float roundedOff) {
		this.roundedOff = roundedOff;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Collection> getCollections() {
		return collections;
	}

	public void setCollections(List<Collection> collections) {
		this.collections = collections;
	}
	
	
}