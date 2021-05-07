package Concrete;
import Abstract.BaseService;
import Entity.User;

public class UserManager implements BaseService<User>{
	@Override
	public User getAll() {
		System.out.println("tüm kullanýcýlar");
		return null;
	}

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("kullanýcý bilgileri güncellendi " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi " + user.getFirstName() + user.getLastName());
		
	}
	

}
