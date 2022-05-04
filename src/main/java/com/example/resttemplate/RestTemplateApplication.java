package com.example.resttemplate;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


/** @author reinaldo
 * Já sei namorar, já sei beijar de língua, agora só me resta
 * saber como consumir outra API
 * */
@SpringBootApplication
public class RestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApplication.class, args);
		consumerAPI();
	}

	public static void consumerAPI() {

		System.out.println("Consumindo o GET de uma API de leve");

		RestTemplate template = new RestTemplate();
		template.getForEntity("https://api.trello.com/1/boards/{id}/memberships", String.class);

		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("api.trello.com")
				.path("/1/boards/{id}/memberships")
				.queryParam("fields", "all")
 				.build();

		ResponseEntity<Trello> entity = template.getForEntity(uri.toUriString(), Trello.class);
		System.out.println(entity.getBody().getName());
	}

}
