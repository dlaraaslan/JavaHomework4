import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("dilara");
		user.setLastName("Aslan");
		user.setEmail("dilara.aslan@dilara.com");
		user.setDateOfBirth(1998);

		Game game = new Game();
		game.setGameName("Valorant");
		game.setPrice(50);

		Campaign campaign = new Campaign();
		campaign.setName("Yeni Kampanya");
		campaign.setDiscount(70);

		GameManager gameManager = new GameManager();
		UserManager userManager = new UserManager();
		SaleManager saleManager = new SaleManager();

		gameManager.add(game);

		userManager.add(user);

		saleManager.sell(game, user);

		saleManager.sellWithCampaign(campaign, game, user);
	}

}
