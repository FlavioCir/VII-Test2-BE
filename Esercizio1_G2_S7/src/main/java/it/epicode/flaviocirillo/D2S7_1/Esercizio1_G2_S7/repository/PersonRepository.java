package it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	
	
}
