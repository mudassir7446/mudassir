package com.ghory.app.accounts.data.jpa.domain.entity.customer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "careOf")
	private String careOf;

	@Column(name = "addrLine1")
	private String addrLine1;

	@Column(name = "addrLine2")
	private String addrLine2;

	@Column(name = "addrLine3")
	private String addrLine3;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "addressType")
	private String addressType;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
