package net.javaguides.hibernate.util;

import java.lang.module.Configuration;
import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.mysql.cj.xdevapi.SessionFactory;
import net.javaguides.hibernate.util.*;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
	if(sessionFactory == null) {
		try {
			Configuration configuration = new Configuration();
			
			Properties settings = new Properties();
			settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
			settings.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernate_db?usesSSL");
			settings.put(Environment.USER,"root");
			settings.put(Environment.PASS,"root");
			settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQLSDialect");
			settings.put(Environment.SHOW_SQL,"true");
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
			settings.put(Environment.HBM2DDL_AUTO,"create-drop");
			configuration.setProperties(settings);
			configuration.addAnnotatedClass(Student.class);
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	return sessionFactory;

	}
}
