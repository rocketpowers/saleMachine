package machinePackeges.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import machinePackeges.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
