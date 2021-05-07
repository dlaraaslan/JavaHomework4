package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.User;

public interface SaleService {
	void sell(Game game, User user);
	void sellWithCampaign(Campaign campaign ,Game game, User user);
}
