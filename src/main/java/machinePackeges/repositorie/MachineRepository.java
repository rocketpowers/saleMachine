package machinePackeges.repositorie;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import machinePackeges.model.Machine;

public interface MachineRepository extends JpaRepository<Machine, Long>{
	
	Optional<Machine> findFirstBy();

}
