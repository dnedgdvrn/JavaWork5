package business.abstrac;

import java.util.List;

import entites.concrete.User;

public interface IValidation {
	 boolean checkPassword(User user);
		boolean isNamesBiggerThanTwo(User user);
		public boolean isEmailValid(User user, List<User> users);
		boolean codeIsEqual(String cm);
}
