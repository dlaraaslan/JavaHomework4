package Concrete;
import Abstract.BaseService;
import Entity.User;

public class UserManager implements BaseService<User>{
	@Override
	public User getAll() {
		System.out.println("t�m kullan�c�lar");
		return null;
	}

	@Override
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("kullan�c� bilgileri g�ncellendi " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi " + user.getFirstName() + user.getLastName());
		
	}
	

}
