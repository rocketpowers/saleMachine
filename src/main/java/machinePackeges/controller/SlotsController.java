package machinePackeges.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import machinePackeges.model.Slots;
import machinePackeges.service.SlotsService;

@RestController
public class SlotsController {

	@Autowired
	private SlotsService slotsService;

	public ResponseEntity<List<Slots>> getSlots() {
		List<Slots> slots = slotsService.getSlots();
		if (!slots.isEmpty()) {
			return ResponseEntity.ok(slots);
		}
		return ResponseEntity.notFound().build();

	}
}