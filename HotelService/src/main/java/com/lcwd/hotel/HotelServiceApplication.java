package com.lcwd.hotel;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;

import java.util.Locale;

@SpringBootApplication
@RequiredArgsConstructor
public class HotelServiceApplication {

	private final MessageSource messageSource;

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Running Message Property Data");
		System.out.println(messageSource.getMessage("api.error.user.not.found", null, Locale.ENGLISH));
		System.out.println(messageSource.getMessage("api.error.user.already.registered", null, Locale.ENGLISH));
		System.out.println(messageSource.getMessage("api.response.user.creation.successful", null, Locale.ENGLISH));
		System.out.println(messageSource.getMessage("api.response.user.update.successful", null, Locale.ENGLISH));
		System.out.println("End Message Property Data");
	}

}
