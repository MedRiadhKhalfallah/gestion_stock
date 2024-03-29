package riadh.gestion.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
    public static final SessionFactory sessionFactory;
    
    static {
        try {
            // Cr�ation de la SessionFactory � partir de hibernate.cfg.xml
            sessionFactory = new Configuration().configure("config/Hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

   // public static final ThreadLocal session = new ThreadLocal();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static Session openSession() {
        return sessionFactory.openSession();
    }
    public static Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    public static void close() {
    	if(sessionFactory!=null)
    	{
    		sessionFactory.close();
    	}
    }
}