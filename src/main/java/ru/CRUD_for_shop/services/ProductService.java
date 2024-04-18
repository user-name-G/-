package ru.CRUD_for_shop.services;

import org.springframework.stereotype.Service;
import ru.CRUD_for_shop.models.Product;
import ru.CRUD_for_shop.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Optional<Product> getProductById(Long id) {
		return productRepository.findById(id);
	}

	public Product createOrUpdateProduct(Product product) {
		return productRepository.save(product);
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}
