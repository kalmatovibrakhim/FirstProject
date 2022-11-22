package company.service;

import company.model.User;
import exception.MyException;

import java.util.ArrayList;

public interface UserService {
    void addUser(User u);
    void findWithID(int i) throws MyException;
    void deleteWithID(int i) throws MyException;
   ArrayList<User> showAllUsers();
}
