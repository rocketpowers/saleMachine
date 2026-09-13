package machinePackeges.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import machinePackeges.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{

}
