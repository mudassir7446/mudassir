/**
 *  VO class represents Product
 */
package com.ghory.apps.accountsmanager.beans.vo;

import java.math.BigDecimal;

/**
 * @author mudassir
 *
 */
public class ProductVO {
	
	private Long id;
	
	private String name;
	
	private String number;
	
	private String version;

	private BigDecimal sellRate;
	
	private BigDecimal purchaseRate;
	
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
