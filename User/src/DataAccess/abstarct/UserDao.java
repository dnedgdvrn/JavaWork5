package DataAccess.abstarct;

import java.util.List;

import entites.concrete.User;

public interface UserDao {
 void add(User user);
 List<User> getAll();
 
}
