package ma.rest.spring;

import ma.rest.spring.entities.Compte;
import ma.rest.spring.entities.TypeCompte;
import ma.rest.spring.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date; // <-- Ajout de l'import Date

@SpringBootApplication
public class MsBanqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBanqueApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null, 8000, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 12500, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 9800, new Date(), TypeCompte.COURANT));
			compteRepository.findAll().forEach(System.out::println);
		};
	}
}
