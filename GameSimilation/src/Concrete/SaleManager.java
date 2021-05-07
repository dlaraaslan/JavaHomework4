package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class SaleManager implements SaleService{

	@Override
	public void sell(Game game, User user) {
		System.out.println(game.getGameName() + " oyunu satýn alýndý "  + user.getEmail());
	}

	@Override
	public void sellWithCampaign(Campaign campaign ,Game game, User user) {
		System.out.println(game.getGameName() + " oyununu " + campaign.getDiscount() + " indirimli satýn aldýnýz " + user.getEmail());
		
	}

}
