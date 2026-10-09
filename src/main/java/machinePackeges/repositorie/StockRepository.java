package machinePackeges.repositorie;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import machinePackeges.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
	Optional<Stock> findBySlot(int slot);

}
