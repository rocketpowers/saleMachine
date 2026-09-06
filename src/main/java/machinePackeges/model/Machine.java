package machinePackeges.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Machine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	@OneToMany
	private List<Slots> slots;
	

	// @Column(nullable = false, unique = true)
	// private String code;

	// @Column(nullable = false)
	// private String name;

	// on/off
	// @Column(nullable = false)
	// private Boolean active = true;
}
