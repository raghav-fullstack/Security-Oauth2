package com.raghav.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
@SpringBootApplication
@EnableOAuth2Sso
public class Oauth2Application {

	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi " + principal.getName() + "Spring Oauth2 application";

	}

	public static void main(String[] args) {
		SpringApplication.run(Oauth2Application.class, args);
	}



}
