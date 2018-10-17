/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Boutique;
import gestion.trelux.services.IBoutique;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BoutiqueHomeImpl extends UnicastRemoteObject implements IBoutique{
    public BoutiqueHomeImpl() throws RemoteException
    {
        super();
    }

    @Override
    public boolean inserer(Boutique b) throws RemoteException {
        	
		try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
			session.persist(b);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
    
    }
}
