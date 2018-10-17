/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;


import gestion.trelux.metier.Employe;
import gestion.trelux.services.IEmploye;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class EmployeHomeImpl extends UnicastRemoteObject implements IEmploye{
 
    public  EmployeHomeImpl() throws RemoteException
    {
        super();
    }
     public boolean inserer(Employe employe) {
		
		try {
                  
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
			session.persist(employe.getPersonne());
                        session.persist(employe);
         
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
   
}
     		
    
}