package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl test = new UserServiceImpl();

        test.createUsersTable();

        test.saveUser("Альберт", "Манасов", (byte) 25);
        test.saveUser("Иван", "Иванов", (byte) 23);
        test.saveUser("Василий", "Пупкин", (byte) 31);
        test.saveUser("Еще", "Один", (byte) 42);


        System.out.println(test.getAllUsers());


        test.cleanUsersTable();
        test.dropUsersTable();













    }
}
