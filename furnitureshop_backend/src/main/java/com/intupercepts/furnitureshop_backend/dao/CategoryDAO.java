package com.intupercepts.furnitureshop_backend.dao;

import java.util.List;

import com.intupercepts.furnitureshop_backend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	

}
