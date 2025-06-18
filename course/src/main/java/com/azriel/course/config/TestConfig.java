package com.azriel.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.azriel.course.entities.User;
import com.azriel.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "Maria@gmail.com", "999999999", "12345");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "999999998", "54321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
