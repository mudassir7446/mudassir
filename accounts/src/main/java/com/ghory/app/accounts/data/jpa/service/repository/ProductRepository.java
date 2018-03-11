package com.ghory.app.accounts.data.jpa.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.ghory.app.accounts.data.jpa.domain.entity.product.Product;

/**
 * Spring Data repository interface for product class
 * @author mudassir
 *
 */
public interface ProductRepository  extends CrudRepository<Product,Long >{
	/**
	 * Returns the Product by name 
	 * @param name
	 * @return
	 */
	Product findByName(String name);

	/**
	 * Returns the product by number
	 * @param number
	 * @param version
	 * @return
	 */
	Product findByNumberAndVersion(String number,String version);
}
