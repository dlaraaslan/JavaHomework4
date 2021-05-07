package Concrete;

import Abstract.BaseService;
import Entity.Game;

public class GameManager implements BaseService<Game> {

	@Override
	public Game getAll() {
		System.out.println("T�m oyunlar");
		return null;
	}

	@Override
	public void add(Game entity) {
		System.out.println("Oyun eklendi");
	}

	@Override
	public void update(Game entity) {
		System.out.println("Oyun g�ncellendi");
	}

	@Override
	public void delete(Game entity) {
		System.out.println("Oyun silindi");
	}

}
