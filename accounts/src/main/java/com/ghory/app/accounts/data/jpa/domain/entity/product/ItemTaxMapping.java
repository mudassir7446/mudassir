package com.ghory.app.accounts.data.jpa.domain.entity.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ghory.app.accounts.data.jpa.domain.entity.Item;
import com.ghory.app.accounts.data.jpa.domain.entity.Taxes;

@Entity
@Table(name = "item_tax_mapping")
public class ItemTaxMapping implements Serializable{

		@Id
	  @ManyToOne(optional = false)
	  @JoinColumn(name = "item_id")
	  private Item item;

		@Id
	  @ManyToOne(optional = false)
	  @JoinColumn(name = "tax_id")	  
	  private Taxes tax;
	  
	  @Column(name = "calculated_tax")
	  private Long calculatedTax;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Taxes getTax() {
		return tax;
	}

	public void setTax(Taxes tax) {
		this.tax = tax;
	}

	public Long getCalculatedTax() {
		return calculatedTax;
	}

	public void setCalculatedTax(Long calculatedTax) {
		this.calculatedTax = calculatedTax;
	}	  
}
