package com.ghory.app.accounts.data.jpa.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.ghory.app.accounts.data.jpa.domain.entity.customer.Customer;

@Entity
public class Collection {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	  
	  @ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "customer_id")
	  private Customer customer;
	  
	  @Column(name = "amount")
	  private BigDecimal amount;
	  
	  @Column(name = "payment_mode")
	  private String paymentMode;
	  
	  @Column(name = "date")
	  private Date date;
	  
	  @Column(name = "collection_by")
	  private String collectionBy;
	  
	  @ManyToMany(fetch = FetchType.LAZY)
	  @JoinTable(name = "collection_invoice_mapping",
	  			 joinColumns = @JoinColumn(name = "collection_id",referencedColumnName = "id"),
	  			 inverseJoinColumns = @JoinColumn(name = "invoice_id", referencedColumnName = "id")
			  )
	  List<Invoice>invoices;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCollectionBy() {
		return collectionBy;
	}

	public void setCollectionBy(String collectionBy) {
		this.collectionBy = collectionBy;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	  
	  
}
