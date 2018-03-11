package com.ghory.app.accounts.data.jpa.service.repository;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ghory.app.accounts.data.jpa.SampleDataJpaApplication;
import com.ghory.app.accounts.data.jpa.domain.entity.Item;
import com.ghory.app.accounts.data.jpa.domain.entity.customer.Customer;
import com.ghory.app.accounts.data.jpa.domain.entity.product.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleDataJpaApplication.class)
public class CustomerRepositoryTest {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	public void testFindByName() {
		 Page<Customer>customers = customerRepository.findByType("Retail", new PageRequest(0, 20));
		Assert.assertNotNull(customers);
		//Since no customer is there , assert false
		Assert.assertFalse(customers.hasContent());
	}
}
