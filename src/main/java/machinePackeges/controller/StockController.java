package machinePackeges.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

}
