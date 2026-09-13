package machinePackeges.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import machinePackeges.model.Slots;
import machinePackeges.service.SlotsService;

@RestController
public class SlotsController {

	@Autowired
	private SlotsService slotsService;

	@GetMapping
	public ResponseEntity<List<Slots>> getSlots() {
		List<Slots> slots = slotsService.getSlots();
		if (!slots.isEmpty()) {
			return ResponseEntity.ok(slots);
		}
		return ResponseEntity.notFound().build();

	}

	@PostMapping
	public ResponseEntity<Slots> saveSlot(@RequestBody Slots slots) {
		Slots newSlot = slotsService.saveSlot(slots);
		return ResponseEntity.ok(newSlot);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteSlot(@PathVariable long id) {
		slotsService.deleteSlot(id);
		return ResponseEntity.ok("successfully deleted");
		// return ResponseEntity.noContent().build();
	}
	
	@PutMapping
	public ResponseEntity<Slots> updateSLots(@RequestBody Slots slots) {
		Slots updateSlots = slotsService.updateSlots(slots);
		return ResponseEntity.ok(updateSlots);
	}

}