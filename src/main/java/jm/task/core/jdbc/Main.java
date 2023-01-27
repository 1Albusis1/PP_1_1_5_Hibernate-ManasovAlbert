package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getSessionFactory();
        UserServiceImpl service = new UserServiceImpl();
        service.dropUsersTable();
        service.createUsersTable();


        service.saveUser("Альберт", "Манасов", (byte) 25);
        service.saveUser("Кристина", "Статьцкая", (byte) 21);
        service.saveUser("Савельев", "Дмитрий", (byte) 27);
        service.saveUser("Ксения", "Малкова", (byte) 21);

        service.getAllUsers();

        service.cleanUsersTable();
        service.dropUsersTable();
    }
}
