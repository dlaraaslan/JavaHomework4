package Concrete;

import Abstract.BaseService;
import Entity.Campaign;

public class CampaignManager implements BaseService<Campaign> {

	@Override
	public Campaign getAll() {
		System.out.println("tüm kampayalar");
		return null;
	}

	@Override
	public void add(Campaign entity) {
		System.out.println("Kampanya eklendi");
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Kampanya güncellendi");
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("Kampanya Kaldýrýldý");
	}
	
}
