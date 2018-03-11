package com.ghory.app.accounts.data.jpa.service.repository;

import java.sql.Timestamp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ghory.app.accounts.data.jpa.domain.entity.Invoice;

/**
 * Repository for {@link Invoice} entity
 * @author mudassir
 *
 */
public interface InvoiceRepository {

	/**
	 * Find the {@link Invoice} by invoice number
	 * @param number
	 * @return Invoice
	 */
	Invoice findByNumber(String number);
	
	/**
	 * Finds the invoices available for a customer
	 * @param name
	 * @param page
	 * @return
	 */
	Page<Invoice>findByCustomerName(String name, Pageable page);
	
	/**
	 * Finds the {@link Invoice} issued in between the dates
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	Page<Invoice>findByDateBetween(Timestamp fromDate,Timestamp toDate,Pageable page);

	/**
	 * Finds the {@link Invoice} issued to a customer in between the dates
	 * @param name
	 * @param fromDate
	 * @param toDate
	 * @param page
	 * @return
	 */
	Page<Invoice>findByCustomerNameBetweenDate(String name , Timestamp fromDate, Timestamp toDate, Pageable page);
}
