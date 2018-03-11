package com.ghory.app.accounts.data.jpa.service.repository;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ghory.app.accounts.data.jpa.SampleDataJpaApplication;
import com.ghory.app.accounts.data.jpa.domain.entity.Item;
import com.ghory.app.accounts.data.jpa.domain.entity.product.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleDataJpaApplication.class)
public class ProductRepositoryTest {
	
	@Autowired
	ProductRepository productRepository;
	
	final String PRODUCT_NAME = "CITIZEN_PARKER_85";
	final String PRODUCT_NUMBER = "PR_001";
	final String PRODUCT_VERSION = "1";
	
	@Test
	public void testFindByName() {
		Product product = productRepository.findByName(PRODUCT_NAME);
		Assert.assertNotNull(product);
		Assert.assertEquals(PRODUCT_NAME, product.getName());
	}

	@Test
	public void testFindByNumberAndVersion() {
		Product product = productRepository.findByNumberAndVersion(PRODUCT_NUMBER,PRODUCT_VERSION);
		Assert.assertNotNull(product);
		Assert.assertNotNull(product.getItems());
		List<Item> items = product.getItems();
		Assert.assertTrue(items.size()>0);
		Assert.assertEquals(PRODUCT_NUMBER, product.getNumber());
		Assert.assertEquals(PRODUCT_VERSION,product.getVersion());
	}

}
