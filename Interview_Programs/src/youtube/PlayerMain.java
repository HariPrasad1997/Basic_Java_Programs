package youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerMain {
	public static void main(String[] args) {
		Player p1 = new Player("Harsha", 50, "Batsman");
		Player p2 = new Player("Anand", 30, "Batsman");
		Player p3 = new Player("Suresh", 10, "Bowler");

		List<Player> players = new ArrayList<>();
		players.add(p1);
		players.add(p2);
		players.add(p3);

		Team team = new Team();
		team.setPlayers(players);

		// Find the sum of scores of all players
		Double collect = players.stream().collect(Collectors.summingDouble(Player::getScore));
		System.out.println(collect);

		int score = team.getScore();
		System.out.println("Total score: " + score);

		// Group the players according to skill set
		Map<String, Long> map = players.stream().collect(Collectors.groupingBy(Player::getType, Collectors.counting()));
		System.out.println(map);
	}

}
