package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(configDemo.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address1"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("personMethodCall"));
			System.out.println(context.getBean("person2MethodCall"));

			// using functional programming
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {

			e.printStackTrace();
		}

	}

}
