package com.intupercepts.furnitureshop_backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intupercepts.furnitureshop_backend.dao.CategoryDAO;
import com.intupercepts.furnitureshop_backend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.intupercepts.furnitureshop_backend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
	}

	/*
	 * @Test public void testAddCategory(){ category =new Category();
	 * category.setName("Kitchen"); category.setDescription("Kitchen Furniture"
	 * ); category.setImageURL("cat1.png"); //category.setActive(true);
	 * 
	 * assertEquals("successfully added category inside table"
	 * ,true,categoryDAO.add(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory(){ category=categoryDAO.get(3);
	 * assertEquals("successfully fetched asingle category in table!"
	 * ,"Kitchen",category.getName());
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory(){ category=categoryDAO.get(3);
	 * 
	 * category.setName("Kitchen Furniture"); assertEquals(
	 * "successfully updated a single category in table!"
	 * ,true,categoryDAO.update(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testListCategory(){
	 * 
	 * assertEquals("successfully fetched the list of categories from table!"
	 * ,3,categoryDAO.list().size());
	 * 
	 * }
	 */

	@Test
	public void testCRUDCategory() {
		// adding category
		category = new Category();
		category.setName("Kitchen");
		category.setDescription("Kitchen Furniture");
		category.setImageURL("cat_1.png");
		// category.setActive(true);

		assertEquals("successfully added category inside table", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Office furniture");
		category.setDescription("Office Furniture");
		category.setImageURL("cat_2.png");
		// category.setActive(true);

		assertEquals("successfully added category inside table", true, categoryDAO.add(category));

		// updating category
		category = categoryDAO.get(3);

		category.setName("Kitchen");
		assertEquals("successfully updated a single category in table!", true, categoryDAO.update(category));

		// delete the category
		assertEquals("Successfully deleted a single category in the table!", true, categoryDAO.delete(category));

		// fetching the list
		assertEquals("Successfully fetched the list of categories from the table!", 1, categoryDAO.list().size());

	}

}
