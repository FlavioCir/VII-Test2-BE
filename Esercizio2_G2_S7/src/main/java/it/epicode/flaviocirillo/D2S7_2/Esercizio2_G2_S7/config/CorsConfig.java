package it.epicode.flaviocirillo.D2S7_2.Esercizio2_G2_S7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("/os/**")
	      .allowedOrigins("http://127.0.0.1:5500")
	      .allowedMethods("GET", "POST", "PUT", "DELETE");
	  }
	
}
