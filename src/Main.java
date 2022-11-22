
import company.Gender.Gender;
import company.model.User;
import company.service.impl.UserServiceImpl;
import exception.MyException;

public class Main {
    public static void main(String[] args) throws MyException {
        UserServiceImpl data = new UserServiceImpl();
        User user1 = new User("User",25, Gender.Male);
        User user2 = new User("user2",24, Gender.Female);
        User user3 =new User("user3",26, Gender.Male);

        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);
        System.out.println(data.showAllUsers());
        data.findWithID(2);
        data.deleteWithID(2);
        System.out.println(data.showAllUsers());
        data.findWithID(2);

    }
}