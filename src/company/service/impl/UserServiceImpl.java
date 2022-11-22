package company.service.impl;
import company.dao.UserDao;
import company.model.User;
import company.service.UserService;
import exception.MyException;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    UserDao userDao =new UserDao(new ArrayList<>());
    @Override
    public void addUser(User u) {
        userDao.getUserler().add(u);
    }
    @Override
    public void findWithID(int i) throws MyException {
        int x = 0;
        for (User user : userDao.getUserler()) {
            if(user.getId()==i){
                System.out.println(user);
                x++;
            }
        }
        if (x==0){
            throw new MyException("Bul ID nomerde User jok");
        }
    }

    @Override
    public void deleteWithID(int i) throws MyException{
        int x = 0;
        for (int j = 0; j < userDao.getUserler().size(); j++) {
            if (userDao.getUserler().get(j).getId()==i){
                userDao.getUserler().remove(userDao.getUserler().get(j));
                x++;
            }
        }
        if (x==0){
            throw new MyException("Bul ID nomerde User jok");
        }
    }

    @Override
    public ArrayList<User> showAllUsers() {
        return userDao.getUserler();
    }
}
