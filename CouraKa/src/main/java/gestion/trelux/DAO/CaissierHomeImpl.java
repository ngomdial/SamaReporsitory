/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Caissier;
import gestion.trelux.services.ICaissier;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class CaissierHomeImpl extends UnicastRemoteObject implements ICaissier{
   public CaissierHomeImpl() throws RemoteException
   {
       super();
   }
    public boolean inserer(Caissier caissier) {
		
		try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
                        session.persist(caissier.getEmploye().getPersonne());
                        session.persist(caissier.getEmploye());
			session.persist(caissier);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
   
}
}
