package one.digitalinnovation.experts.productcatalog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.experts.productcatalog.model.Product;
import one.digitalinnovation.experts.productcatalog.repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	//Dependencias
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	Product creat(@RequestBody Product product) {
		
		return productRepository.save(product);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	Optional<Product> findById(@PathVariable Integer id) {
		
		return productRepository.findById(id);
	}
}
