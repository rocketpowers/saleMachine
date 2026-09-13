package machinePackeges.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import machinePackeges.model.Slots;
import machinePackeges.repositorie.SlotsRepository;

@Service
public class SlotsService {

	@Autowired
	private SlotsRepository slotsRepository;

	public List<Slots> getSlots() {
		return slotsRepository.findAll();
	}

}
