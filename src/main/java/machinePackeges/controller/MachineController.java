package machinePackeges.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import machinePackeges.model.Machine;
import machinePackeges.service.MachineService;

@RestController
@RequestMapping("/machine")
public class MachineController {

	@Autowired
	private MachineService machineService;

	@GetMapping
	public ResponseEntity<Machine> getMachine() {

		Optional<Machine> machine = machineService.getMachine();
		if (machine.isPresent()) {
			return ResponseEntity.ok(machine.get());
		}
		return ResponseEntity.notFound().build();

	}
}
