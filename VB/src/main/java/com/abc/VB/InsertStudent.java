package com.abc.VB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            // Create a new student
            Student newStudent = new Student();
            newStudent.setId(4); // Set a unique ID
            newStudent.setName("last");
            newStudent.setBranch("ec");
            newStudent.setCgpa(5.0);

            // Save the new student to the database
            session.save(newStudent);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
