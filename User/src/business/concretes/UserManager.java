package business.concretes;

import java.util.List;
import java.util.Scanner;

import DataAccess.abstarct.UserDao;
import business.abstrac.IValidation;
import business.abstrac.UserService;
import entites.concrete.User;

public class UserManager implements UserService {
   UserDao userDao;
   IValidation validation;
  
	public UserManager(UserDao userDao, IValidation validation) {
	super();
	this.userDao = userDao;
	this.validation = validation;
}

	@Override
	public void add(User user) {
		
		boolean parola=validation.checkPassword(user);
		boolean mail=validation.isEmailValid(user, getAll());
		boolean name=validation.isNamesBiggerThanTwo(user);
		if(parola && mail && name) {
			System.out.println("mail adresinize gelen kodu giriniz");
			@SuppressWarnings("resource")
			Scanner confirmMail_ = new Scanner(System.in);
			String cm= confirmMail_.next();
			if(validation.codeIsEqual(cm)) {
				userDao.add(user);
				return;
			}else {
				System.out.println("Onay kodunu yanlis girdiniz, tekrar kayit olmadi deneyin ya da sistemi dehal terk edin.");
				return;
			}
		}
	}
;
	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void logIn(String mail, String password) {
		for (User user_: this.getAll()) {
			if(user_.getePosta().equals(mail)&& user_.getPassword().equals(password)) {
				System.out.println(user_.getePosta()+" Hesabina Giris Yapildi.");
				return;
			}
		}
		System.out.println("Email veya sifre hatali. Giris yapilamadi.");
		
	}

}
