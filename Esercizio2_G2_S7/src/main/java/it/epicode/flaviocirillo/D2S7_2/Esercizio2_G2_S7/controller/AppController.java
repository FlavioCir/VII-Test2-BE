package it.epicode.flaviocirillo.D2S7_2.Esercizio2_G2_S7.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/os")
public class AppController {

	@GetMapping("/get-string")
    public String m1() {

        RestTemplate rt = new RestTemplate();
        String rtUrl = "http://localhost:8082/app/data1";
        ResponseEntity<String> response = rt.getForEntity(rtUrl, String.class);
        return "response: " + response.getBody() + "";

    }

    @GetMapping("/get-string-async")
    public String m1_1() {
        // WebClient
        return null;
    }

    @GetMapping("/get-people")
    public String m2() {

        RestTemplate rt = new RestTemplate();
        String rtUrl = "http://localhost:8082/app/data2";
        String response = rt.getForObject(rtUrl, String.class);
        return "people list: " + response;

    }

    @GetMapping("/get-people-json")
    public Object m2Json() {
        RestTemplate rt = new RestTemplate();
        String rtUrl = "http://localhost:8082/app/data3";
        Object response = rt.getForObject(rtUrl, Object.class);
        return response;

    }
	
}
