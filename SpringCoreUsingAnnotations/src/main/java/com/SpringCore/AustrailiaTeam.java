package com.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class AustrailiaTeam implements CricketTeam {

	public void nameOfTeam() {
		System.out.println("Name of Team is Australia Team");

	}

	public void captainOfTeam() {
		System.out.println("Captain of Team is David Warner");

	}

}
