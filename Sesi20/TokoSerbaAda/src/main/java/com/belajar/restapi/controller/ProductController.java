package com.belajar.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.restapi.entity.Product;
import com.belajar.restapi.service.ProductService;


//@ //RestController
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	// display list of employees
	@GetMapping("/home")
	public String viewHomePage(Model model) {
		return findPaginated(1, "nama", "asc", model);		
	}
	
	@GetMapping("/showNewProductForm")
	public String showNewProductForm(Model model) {
		// create model attribute to bind form data
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product product) {
		// save employee to database
		productService.saveProduct(product);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get employee from the service
		Product product = productService.getProductById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("product", product);
		return "update_product";
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.productService.deleteProductById(id);
		return "redirect:/";
	}
	
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Product> page = productService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Product> listEmployees = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listProducts", listEmployees);
		return "index";
	}
}
