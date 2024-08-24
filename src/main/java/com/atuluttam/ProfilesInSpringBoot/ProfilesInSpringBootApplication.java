package com.atuluttam.ProfilesInSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"Mycontroller", "Myservice"})
public class ProfilesInSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProfilesInSpringBootApplication.class, args);
	}

}
