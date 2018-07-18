package com.intupercepts.furnitureshop_backend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.intupercepts.furnitureshop_backend.dao.CategoryDAO;
import com.intupercepts.furnitureshop_backend.dto.Category;

@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> Categories=new ArrayList<>();
	
	static{
		
		Category category= new Category();
		
		//adding first category
		
		category.setId(1);
		category.setName("Indoor Furniture");
		category.setDescription("Indoor category");
		category.setImageURL("cat1.png");
		
		Categories.add(category);
		
		
		category= new Category();
		
		//adding Second category
		
		category.setId(2);
		category.setName("Outdoor Furniture ");
		category.setDescription("Out door category");
		category.setImageURL("cat1.png");
		
		Categories.add(category);
		
		
		
		category= new Category();
		
		//adding Third  category
		
		category.setId(3);
		category.setName("Kitchen");
		category.setDescription("Kitchen Furniture category");
		category.setImageURL("cat1.png");
		
		Categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		
		return Categories;
	}

	@Override
	public Category get(int id) {
		// for each categories
		for(Category category:Categories){
			if(category.getId()==id)
			return category;
		}
		return null;
	}

}
