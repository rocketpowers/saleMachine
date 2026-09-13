package machinePackeges.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import machinePackeges.model.Stock;
import machinePackeges.service.StockService;

@RequestMapping("/stock")
@RestController
public class StockController {

	@Autowired
	private StockService stockService;

	@GetMapping
	public ResponseEntity<List<Stock>> getStocks() {
		List<Stock> stocks = stockService.getStocks();
		if (!stocks.isEmpty()) {
			return ResponseEntity.ok(stocks);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	public ResponseEntity<Stock> saveStock(@RequestBody Stock stock) {
		Stock newStock = stockService.saveStock(stock);
		return ResponseEntity.ok(stock);
	}

	@PutMapping
	public ResponseEntity<Stock> updateStock(@RequestBody Stock stock) {
		Stock updateStock = stockService.updateStock(stock);
		return ResponseEntity.ok(updateStock);
	}

	@DeleteMapping
	public ResponseEntity<String> deleteStock(@PathVariable Long id) {
		stockService.deleteStock(id);
		return ResponseEntity.ok("successfully deleted");

	}

}
