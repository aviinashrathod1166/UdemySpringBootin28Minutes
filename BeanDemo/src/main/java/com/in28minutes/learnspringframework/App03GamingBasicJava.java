package com.in28minutes.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

public class App03GamingBasicJava {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(gamingConfiguration.class)) {

			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();

		} catch (BeansException e) {

			e.printStackTrace();
		}

	}

}
