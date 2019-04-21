package andy.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpainishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Servicio de Saludo Primrio";
	}
}
