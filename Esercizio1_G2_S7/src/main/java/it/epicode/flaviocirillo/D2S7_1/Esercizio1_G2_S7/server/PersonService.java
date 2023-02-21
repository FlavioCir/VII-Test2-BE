package it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.entity.Person;
import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository pRepo;
	
	public Person save (Person p) {
		return pRepo.save(p);
	}

    public List<Person> getAll() {
    	return pRepo.findAll();
    }
	
}
