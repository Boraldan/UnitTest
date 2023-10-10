package ru.boraldan.tdd;

/**
 * Не стал вносить изменения в написанный код,
 * хотя считаю правильным закрыть поля класса модификатором доступа private
 * и сгенерировать геттеры для полей класса.
 */
public class User {

    String name;
    String password;

    Role userRole;

    boolean isAuthenticate = false;

    public User(String name, String password, Role userRole) {
        this.name = name;
        this.password = password;
        this.userRole = userRole;
    }


    public boolean authenticate(String name, String password) {
        this.isAuthenticate = (this.name.equals(name) && this.password.equals(password));
        return this.isAuthenticate;
    }

    public boolean isRoleAdmin(){
        return this.userRole.equals(Role.ADMIN);
    }

}