package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraGameQualifier")
public class superContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("up");

	}

	@Override
	public void down() {
		System.out.println("sit down");

	}

	@Override
	public void left() {
		System.out.println("Go Back");

	}

	@Override
	public void right() {
		System.out.println("Shoot a bullet");

	}

}
