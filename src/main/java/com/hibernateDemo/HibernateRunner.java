package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
import java.sql.SQLException;

public class HibernateRunner {
    public static void main(String[] args) throws SQLException {
//        Connection connection = DriverManager.getConnection("db.url", "db.username", "db.password");
        Configuration configuration = new Configuration();
        configuration.configure();

        try(SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession()){
            System.out.println("OK!");

        }

    }
}
