package business.abstrac;

import java.util.List;

import entites.concrete.User;

public interface UserService {
 void add(User user);
 List<User> getAll();
 void logIn(String mail,String password);
 
 
 
}
