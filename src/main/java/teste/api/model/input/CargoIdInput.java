package teste.api.model.input;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CargoIdInput {
	@NotNull
	private Integer id;
}
