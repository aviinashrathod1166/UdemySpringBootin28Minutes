package com.in28minutes.learnspringframework.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {
};

record Address(String firstNmae, String city) {
};

@Configuration
public class configDemo {

	@Bean
	public String name() {

		return "Avinash Rathod";
	}

	@Bean
	public int age() {
		return 25;
	}

	@Bean
	public List<Person> person() {

		List<Person> pl = new ArrayList<>();
		pl.add(new Person("Sapana", 29));
		pl.add(new Person("Suraj", 28));
		pl.add(new Person("Raviraj", 26));
		pl.add(new Person("Shaurya", 5));

		return pl;
	}

	@Bean(name = "address1")
	@Primary
	public Address address() {
		return new Address("Avinash ", "Pune-address");
	}

	@Bean(name = "address2")
	@Qualifier("address2Qualifier")
	public Address address2() {
		return new Address("Sapana ", "Baner-address");
	}

	@Bean
	public Person personMethodCall() {
		return new Person(name(), age());
	}

	@Bean
	public Person person2MethodCall(String name, int age) {
		return new Person(name, age);
	}

}
