package machinePackeges.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import machinePackeges.model.Machine;

public interface MachineRepository extends JpaRepository<Machine, Long>{

}
