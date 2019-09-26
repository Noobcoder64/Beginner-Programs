package classes;
import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> players;
	private int maxSize = 16;
	private int size = 0;
	private int goals = 0;
	
	public Team(String name) {
		this.name = name;
		players = new ArrayList<Player>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addPlayer(Player newPlayer) {
		if (size < maxSize) {
			players.add(newPlayer);
			this.size++;
		}
	}
	
	public void printPlayers() {
		for (Player player : players) {
			System.out.println(player);
		}
	}
	
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public int size() {
		return this.size;
	}
	
	public int goals() {
		for (Player player : players) {
			this.goals += player.goals();
		}
		return this.goals;
	}
}
