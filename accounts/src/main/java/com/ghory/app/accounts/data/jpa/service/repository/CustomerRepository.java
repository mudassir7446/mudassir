package com.ghory.app.accounts.data.jpa.service.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.ghory.app.accounts.data.jpa.domain.entity.customer.Customer;

/**
 * Repository for {@link Customer} entity
 * @author mudassir
 *
 */
public interface CustomerRepository extends CrudRepository<Customer,Long>{

	/**
	 * Find by the {@link Customer.name}. 
	 * @param name
	 * @return {@link Customer}
	 */
	Customer findByName(String name);

	/**
	 * Returns the list of {@link Customer } by type
	 * @param type
	 * @param sort
	 * @return {@link List<Customer>}
	 */
	List<Customer>findByType(String type,Sort sort);
	
	/**
	 * Returns the list of {@link Customer} with Pagination
	 * @param type
	 * @param pageable
	 * @return {@link Page<Customer>}
	 */
	Page<Customer>findByType(String type,Pageable pageable);
}
