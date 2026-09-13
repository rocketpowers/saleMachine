package machinePackeges.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import machinePackeges.model.Product;
import machinePackeges.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	public ResponseEntity<List<Product>> getProducts() {

		List<Product> products = productService.getProducts();
		if (!products.isEmpty()) {

			return ResponseEntity.ok(products);
		}
		return ResponseEntity.notFound().build();
	}

}
