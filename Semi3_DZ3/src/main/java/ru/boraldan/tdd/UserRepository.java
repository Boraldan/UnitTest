package ru.boraldan.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {


    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       if (user.isAuthenticate) this.data.add(user);
       else throw new RuntimeException("Неверный логин или пароль!");
    }


    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }


    public void logOutExceptAdministrator(){
        data.removeIf(user -> !user.isRoleAdmin());
    }
}