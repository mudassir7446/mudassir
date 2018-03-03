/**
 * Value object to be used to send the data back to the controller. Can be used to send the response as well
 */
package com.ghory.apps.accountsmanager.beans.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author mudassir
 *
 */
public class InvoiceVO {

	private String number;
	
	private Timestamp dateTime;
	
	private BigDecimal totalBeforeTax;

	private BigDecimal totalAfterTax;

	private BigDecimal igst;

	private BigDecimal cgst;

	private BigDecimal sgst;

	private String issuer;

	private float roundedOff;
	
	private CustomerVO customer;

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

	public BigDecimal getTotalBeforeTax() {
		return totalBeforeTax;
	}

	public void setTotalBeforeTax(BigDecimal totalBeforeTax) {
		this.totalBeforeTax = totalBeforeTax;
	}

	public BigDecimal getTotalAfterTax() {
		return totalAfterTax;
	}

	public void setTotalAfterTax(BigDecimal totalAfterTax) {
		this.totalAfterTax = totalAfterTax;
	}

	public BigDecimal getIgst() {
		return igst;
	}

	public void setIgst(BigDecimal igst) {
		this.igst = igst;
	}

	public BigDecimal getCgst() {
		return cgst;
	}

	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}

	public BigDecimal getSgst() {
		return sgst;
	}

	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
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

	public CustomerVO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerVO customer) {
		this.customer = customer;
	}
}
