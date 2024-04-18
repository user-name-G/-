package ru.CRUD_for_shop.controllers;

import org.springframework.web.bind.annotation.*;
import ru.CRUD_for_shop.models.Product;
import ru.CRUD_for_shop.services.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/{id}")
	public Optional<Product> getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.createOrUpdateProduct(product);
	}

	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
		product.setId(id);
		return productService.createOrUpdateProduct(product);
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
}

