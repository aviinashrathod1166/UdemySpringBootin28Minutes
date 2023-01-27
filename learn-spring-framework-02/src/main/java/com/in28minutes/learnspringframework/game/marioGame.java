package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class marioGame implements GamingConsole {
	public void up() {
		System.out.println("jump up");
	}

	public void down() {
		System.out.println("sit down");
	}

	public void left() {
		System.out.println("Go Back");
	}

	public void right() {
		System.out.println("Accelrate");
	}

}
