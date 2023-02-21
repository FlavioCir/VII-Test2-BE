package it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.config.PersonConfig;
import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.entity.Person;
import it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.server.PersonService;

@SpringBootApplication
public class Esercizio1G2S7Application implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1G2S7Application.class, args);
	}
	
	@Autowired
	PersonService ps;
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonConfig.class);

	@Override
	public void run(String... args) throws Exception {
		
//		popolaDB();
//		
//		((AnnotationConfigApplicationContext)ctx).close();
		
	}
	
	public void popolaDB() {
		Person p1 = (Person)ctx.getBean("p", "Gino", "Neri", 45, "gneri");
		ps.save(p1);
		
	}

}
