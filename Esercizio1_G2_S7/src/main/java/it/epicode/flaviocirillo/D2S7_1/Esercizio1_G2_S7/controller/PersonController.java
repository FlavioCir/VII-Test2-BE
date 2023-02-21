package it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.entity.Person;
import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.server.PersonService;

@RestController
@RequestMapping("/app/")
public class PersonController {

	@Autowired
	PersonService ps;
	
	@GetMapping("data1") 
	public String data1() {
		return "response";
	}
	
	@GetMapping("data2")
	public ResponseEntity<List<Person>> getAll() {
		List<Person> person = ps.getAll();
		
		if( person.isEmpty() ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	
	@RequestMapping(value = "data3", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Person>> getAll_2() {
		List<Person> person = ps.getAll();
		
		if( person.isEmpty() ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	
}
