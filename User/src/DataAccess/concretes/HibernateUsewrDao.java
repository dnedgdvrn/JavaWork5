package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstarct.UserDao;
import entites.concrete.User;

public class HibernateUsewrDao implements UserDao {
	private List<User> users= new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println("Kayýt Ýþleminiz baþarýlý bir þekilde gerçekleþti"+""+user.getAd());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
