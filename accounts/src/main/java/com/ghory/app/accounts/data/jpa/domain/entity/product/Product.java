/**
 *  Entity class represents Product
 */
package com.ghory.app.accounts.data.jpa.domain.entity.product;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.ghory.app.accounts.data.jpa.domain.entity.Item;
import com.ghory.app.accounts.data.jpa.domain.entity.Taxes;

/**
 * @author mudassir
 *
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "product_name")
	private String name;

	@Column(name = "product_number")
	private String number;

	@Column(name = "product_version")
	private String version;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	private List<Item> items;

	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
	private List<Taxes> taxes;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Taxes> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Taxes> taxes) {
		this.taxes = taxes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
