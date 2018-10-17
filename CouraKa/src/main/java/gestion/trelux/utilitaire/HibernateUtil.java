package gestion.trelux.utilitaire;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author inspectrice Amy Sene
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
   
	 private static ServiceRegistry serviceRegistry;
    
    static {
        try {
          Configuration configuration = new Configuration().configure();
	 serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                

        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
    public static void closeSession(){
        
    }
   
}
