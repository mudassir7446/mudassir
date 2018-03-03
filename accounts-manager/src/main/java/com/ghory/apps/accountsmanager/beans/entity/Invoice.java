package com.ghory.apps.accountsmanager.beans.entity;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ghory.apps.accountsmanager.beans.entity.customer.Customer;


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
	
	@Column(name = "invoice_total_before_tax")
	private BigDecimal totalBeforeTax;

	@Column(name = "invoice_total_after_tax")
	private BigDecimal totalAfterTax;

	@Column(name = "invoice_igst")
	private BigDecimal igst;

	@Column(name = "invoice_cgst")
	private BigDecimal cgst;

	@Column(name = "invoice_sgst")
	private BigDecimal sgst;

	@Column(name = "invoice_issuer")
	private String issuer;

	@Column(name = "invoice_roundedoff")
	private float roundedOff;
	
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "invoice_customer_id",nullable = true)
	private Customer customer;
	
	@OneToMany(mappedBy = "invoice")
	private List<Item> items;
}
