package machinePackeges.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import machinePackeges.model.Stock;
import machinePackeges.repositorie.StockRepository;

@Service
public class StockService {

	@Autowired
	private StockRepository stockRepository;

	public List<Stock> getStocks() {
		return stockRepository.findAll();
	}

}
