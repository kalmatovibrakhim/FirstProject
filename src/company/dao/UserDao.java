package company.dao;

import company.model.User;
import company.service.UserService;
import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> userler;


    public UserDao(ArrayList<User> userler) {
        this.userler = userler;
    }

    public UserDao() {
    }

    public ArrayList<User> getUserler() {
        return userler;
    }

    public void deleteUser(User user) {
        userler.remove(user);
    }

    public void addUser(User user) {
        userler.add(user);
    }
}
