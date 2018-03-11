package com.ghory.app.accounts.data.jpa.domain.entity;

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

import com.ghory.app.accounts.data.jpa.domain.entity.product.Product;

@Entity
@Table(name = "taxes")
public class Taxes implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "tax_name")
	private String name;

	@Column(name = "tax_type")
	private String type;

	@Column(name = "percent")
	private BigDecimal percent;

	@ManyToOne(optional = true)
	@JoinColumn(name = "tax_id")
	private Taxes parentTax;

	@OneToMany(mappedBy = "parentTax")
	private List<Taxes> childTax;

	public List<Taxes> getChildTax() {
		return childTax;
	}

	public void setChildTax(List<Taxes> childTax) {
		this.childTax = childTax;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Product product;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}

	public Taxes getParentTax() {
		return parentTax;
	}

	public void setParentTax(Taxes parentTax) {
		this.parentTax = parentTax;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
