package UserMain;


import DataAccess.concretes.HibernateUsewrDao;
import business.abstrac.UserService;
import business.concretes.UserManager;
import business.concretes.ValidationManager;
import entites.concrete.User;

public class Main {

	public static void main(String[] args) {
	HibernateUsewrDao hDao = new  HibernateUsewrDao();
	UserService  userService= new UserManager(new HibernateUsewrDao(),new ValidationManager(hDao));
    System.out.println("**************Kayittt 1111***************");
    User user = new User("AY�E","Demir","dnedgdvrn@gmail.com","dagdeviren");
	userService.add(user);
	System.out.println("\n\n");
	System.out.println("****************Kayit 2****************");
	User user1 = new User("DNE","Demir","dnedgdvrn1@gmail.com","dagdeviren");
	userService.add(user1);
	System.out.println("\n\n");
	System.out.println("****************Kayit 2**************** 6 KARAKTER ZORUNLU�U");
    User user2 = new User("aYDIN","Demir","dnedgdvrn2@gmail.com","dag");
    userService.add(user2);
	System.out.println("\n\n");
	System.out.println("****************Kayit 2**************** e mail ayn�");
	User user3 = new User("Emir","Yaln�z","dnedgdvrn2@gmail.com","dagdelen");
	userService.add(user3);
	System.out.println("\n\n");
	System.out.println("****************Kayit 2**************** 2 karakter zorunlu�u");
	User user4 = new User("Em","Yaln�z","dnedgdvrn2@gmail.com","dagdelen");
	userService.add(user4);
	
	
	
	}

}
