package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        userService.saveUser("Dima", "Petrov", (byte) 21);
        userService.saveUser("Vladimir", "Vorobev", (byte) 22);
        userService.saveUser("Igor", "Malcev", (byte) 23);
        userService.getAllUsers().forEach(System.out :: println);
        userService.cleanUsersTable();
        userService.removeUserById(2);
        userService.dropUsersTable();

    }
}
