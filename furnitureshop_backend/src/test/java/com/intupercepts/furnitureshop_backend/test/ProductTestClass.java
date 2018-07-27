package com.intupercepts.furnitureshop_backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intupercepts.furnitureshop_backend.dao.ProductDAO;
import com.intupercepts.furnitureshop_backend.dto.Product;

public class ProductTestClass {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;


	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.intupercepts.furnitureshop_backend");
		context.refresh();

		productDAO = (ProductDAO) context.getBean("productDAO");
	}



	/*@Test
	public void testCRUDCategory() {
		// create operation
		product = new Product();

		product.setName("wooden chairs");
		product.setDescription("wooden chairs with brown color!");
		product.setUnitPrice(2500);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		// category.setActive(true);

		assertEquals("something went wrong while inserting a new product!", 
				true,productDAO.add(product));



		// updating category
		product = productDAO.get(2);

		product.setName("wooden sofa");
		assertEquals("something went wrong while updating a existing product!",
				true, productDAO.update(product));

		// delete the category
		assertEquals("Successfully deleted a single category in the table!",
				true, productDAO.delete(product));

		// fetching the list
		assertEquals("Successfully fetched the list of categories from the table!",
				5, productDAO.list().size());

	}
	 */

	@Test
	public void testListActiveProducts() {
		assertEquals("Something went wrong while fetching the list of products!",
				4,productDAO.listActiveProducts().size());				
	} 


	@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Something went wrong while fetching the list of products!",
				3,productDAO.listActiveProductsByCaegory(3).size());
		assertEquals("Something went wrong while fetching the list of products!",
				1,productDAO.listActiveProductsByCaegory(2).size());
	} 
	
	@Test
	public void testGetLatestActiveProduct() {
		assertEquals("Something went wrong while fetching the list of products!",
				2,productDAO.getLatestActiveProducts(2).size());

	} 
}
