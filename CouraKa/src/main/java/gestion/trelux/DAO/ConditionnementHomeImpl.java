/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Conditionnement;
import gestion.trelux.services.IConditionnement;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class ConditionnementHomeImpl extends UnicastRemoteObject implements IConditionnement{
   
    public ConditionnementHomeImpl() throws RemoteException
    {
        super();
    }
    
    public  List<Conditionnement> listeCondition(){
         
	 
          Session session = HibernateUtil.getSession();
	    List condition=session.createCriteria(Conditionnement.class).list();
	
            
                 session.close();
		return condition;
	       
	    	
	}
    public void addCondition(Conditionnement con)
    {
         Session session = HibernateUtil.getSession();
         Transaction tx=session.beginTransaction();
         session.persist(con);
         tx.commit();
         session.close();
        
    }

}
