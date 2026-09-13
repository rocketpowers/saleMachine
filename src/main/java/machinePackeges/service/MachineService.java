package machinePackeges.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import machinePackeges.model.Machine;
import machinePackeges.repositorie.MachineRepository;

@Service
public class MachineService {

	@Autowired
	private MachineRepository machineRepository;

	public Optional<Machine> getMachine() {
		return machineRepository.findFirstBy();

	}

}
