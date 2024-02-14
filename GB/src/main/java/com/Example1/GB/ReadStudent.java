package com.Example1.GB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudent {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernet.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            // Retrieve a student by ID
            int studentId = 1; // Replace with the ID of the student you want to retrieve
            Student student = session.get(Student.class, studentId);

            System.out.println("Student Details:");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Branch: " + student.getBranch());
            System.out.println("CGPA: " + student.getCgpa());

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}