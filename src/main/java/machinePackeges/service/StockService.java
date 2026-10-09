package machinePackeges.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import machinePackeges.model.Stock;
import machinePackeges.repositorie.StockRepository;


@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getStocks() {
        return stockRepository.findAll();
    }

    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock updateStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }

    public boolean hasStock(int slot) {
        Optional<Stock> stock = stockRepository.findBySlot(slot);

        if (stock.isPresent()) {
            return stock.get().getQuantity() > 0;
        }

        return false;
    }

    public boolean sellOne(int slot) {
        Stock stock = stockRepository.findBySlot(slot).orElse(null);

        if (stock == null || stock.getQuantity() <= 0) {
            return false;
        }

        stock.setQuantity(stock.getQuantity() - 1);
        stockRepository.save(stock);

        return true;
    }
}


    
    
    
   
   
