package business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import DataAccess.abstarct.UserDao;
import business.abstrac.IValidation;
import entites.concrete.User;

public class ValidationManager implements IValidation {
   UserDao userdao;
	public ValidationManager(UserDao userdao) {
	super();
	this.userdao = userdao;
}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()<6) {
	System.out.println("Minimum 6 karakterden oluþumasý gerekli");
	return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean isNamesBiggerThanTwo(User user) {
	if(user.getAd().length()>2 && user.getSoyad().length()>2) {
		return true;
	}
	else
	{
		System.out.println("Ad ve soyad 2 karakterden fazla olmasý lazým");
		return false;
	}
		
	}
private static final String EMAIL_PATTERN="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	@Override
	public boolean isEmailValid(User user, List<User> users_) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(user.getePosta()).find()) {
			for(User user_ : users_) {
				if(user_.getePosta().equals(user.getePosta())) {
					System.out.println("kayýt olmadý");
					return false;
				}
				
			}
			return true;
		}
	   System.out.println("kayýt yapýlmadý");
		return false;
	}
	String confirmCode="0";
	@Override
	public boolean codeIsEqual(String code) {
		if(confirmCode.equals(code)) {
			System.out.println("Onay kodu eslestirildi...");
			return true;
		}else {			
			System.out.println("W Onay kodu eslestirilemedi! Kayit Yapilamadi");
			return false;
		}
	}
	
   
}