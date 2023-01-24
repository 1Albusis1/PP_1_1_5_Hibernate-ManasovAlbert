package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getSessionFactory();
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.dropUsersTable();
        userDao.createUsersTable();


        userDao.saveUser("Альберт", "Манасов", (byte) 25);
        userDao.saveUser("Кристина", "Статьцкая", (byte) 21);
        userDao.saveUser("Савельев", "Дмитрий", (byte) 27);
        userDao.saveUser("Ксения", "Малкова", (byte) 21);

        userDao.getAllUsers();

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
