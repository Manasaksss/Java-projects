package com.abc.VB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(SomeClass.class)
                                    .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            SomeClass someObject = new SomeClass();
            someObject.setId(id);
            someObject.setName(name);

            session.beginTransaction();

            session.save(someObject);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
        scanner.close();
        }
}