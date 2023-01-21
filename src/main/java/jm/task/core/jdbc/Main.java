package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl test = new UserServiceImpl();
/*
       //Создаю таблицу
      test.createUsersTable();

*/
       //добавляю в таблицу
       test.saveUser("Альберт", "Манасов", (byte) 25);
       test.saveUser("Иван", "Иванов", (byte) 21);
    //чекаю список всех юзеров в таблице



       /*//удаляю юзера по id
        test.removeUserById(2);
        System.out.println(test.getAllUsers());*/
        test.cleanUsersTable();
        System.out.println(test.getAllUsers());




    }
}
