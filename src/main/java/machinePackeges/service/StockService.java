package machinePackeges.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import machinePackeges.model.Stock;
import machinePackeges.repositorie.SlotsRepository;
import machinePackeges.repositorie.StockRepository;

@Service
public class StockService {

	

	@Autowired
	private StockRepository stockRepository;

	StockService(StockRepository stockRepository) {
		
		this.stockRepository=stockRepository;
	}

	public List<Stock> getStocks() {
		return stockRepository.findAll();
	}

	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);

	}

	public Stock updateStock(Stock stock) {
		return stockRepository.save(stock);

	}

	//public String deleteStock(Long id) {
		//stockRepository.deleteById(id);
		//return "successfully deleted";
		
		public void deleteStock(Long id) {
		    stockRepository.deleteById(id);
		
	}

}
