/**
 *  Entity class represents Product
 */
package com.ghory.apps.accountsmanager.beans.entity.product;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author mudassir
 *
 */
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_number")
	private String number;
	
	@Column(name = "product_version")
	private String version;

	@Column(name = "sell_rate")
	private BigDecimal sellRate;
	
	@Column(name = "purchase_rate")
	private BigDecimal purchaseRate;
	
	@Column(name= "extra_cost")
	private BigDecimal extraCost;

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

	public BigDecimal getSellRate() {
		return sellRate;
	}

	public void setSellRate(BigDecimal sellRate) {
		this.sellRate = sellRate;
	}

	public BigDecimal getPurchaseRate() {
		return purchaseRate;
	}

	public void setPurchaseRate(BigDecimal purchaseRate) {
		this.purchaseRate = purchaseRate;
	}

	public BigDecimal getExtraCost() {
		return extraCost;
	}

	public void setExtraCost(BigDecimal extraCost) {
		this.extraCost = extraCost;
	}
}
