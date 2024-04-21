package com.SpringCore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		CricketTeam team = context.getBean("indiaTeam", CricketTeam.class);
		team.captainOfTeam();
		team.nameOfTeam();

	}
}
