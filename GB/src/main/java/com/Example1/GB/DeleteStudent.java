package com.Example1.GB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernet.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            // Retrieve a student by ID
            int studentId = 4; // Replace with the ID of the student you want to delete
            Student student = session.get(Student.class, studentId);

            // Delete the student
            session.delete(student);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}