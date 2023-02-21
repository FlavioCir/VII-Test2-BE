package it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.entity.Person;

@Configuration
public class PersonConfig {

	@Bean
	@Scope("prototype")
	public Person p(String nome, String cognome, int eta, String username) {
		return Person.builder()
				.nome(nome)
				.cognome(cognome)
				.eta(eta)
				.username(username)
				.build();
	}
	
}
