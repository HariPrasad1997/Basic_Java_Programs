package youtube;

public class Player {

	private String name;
	private int score;
	private String type;

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", type=" + type + "]";
	}

	public Player(String name, int score, String type) {
		super();
		this.name = name;
		this.score = score;
		this.type = type;
	}

}
