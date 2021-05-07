package Entity;

public class Game {
	private int id;
	private String gameName;
	private double price;
	
	public Game() {}
	
	public Game(String gameName, double price) {
		super();
		this.gameName = gameName;
		this.price = price;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
