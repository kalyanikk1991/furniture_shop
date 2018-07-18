package com.intupercepts.furnitureshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intupercepts.furnitureshop_backend.dao.CategoryDAO;
import com.intupercepts.furnitureshop_backend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");

		//passing list of category 
		mv.addObject("Categories" ,categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv; 
	}


	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Aabout Us");
		mv.addObject("userClickAbout",true);
		return mv; 
	}

	


	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","contact");
		mv.addObject("userClickContact",true);
		return mv; 
	}
	
	//methods to load all products
	@RequestMapping(value={"/show/all/products"})
	public ModelAndView showAllProducts()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");

		//passing list of category 
		mv.addObject("Categories" ,categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv; 
	}
	
	
	//methods to load all products
		@RequestMapping(value={"/show/category/{id}/products"})
		public ModelAndView showCategoryProducts(@PathVariable("id") int id)
		{
			ModelAndView mv=new ModelAndView("page");
			
			
			//categoryDAO to fetch single category 
			Category category=null;
			category=categoryDAO.get(id);
			
			mv.addObject("title",category.getName());

			//passing list of category 
			mv.addObject("Categories" ,categoryDAO.list());
			
			//passing single category object
			mv.addObject("category" ,category);
			
			mv.addObject("userClickCategoryProducts",true);
			return mv; 
		}


	

	}
