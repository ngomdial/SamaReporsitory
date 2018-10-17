/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Gerant;
import gestion.trelux.services.IGerant;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class GerantHomeImpl extends UnicastRemoteObject implements IGerant{
   
    public GerantHomeImpl() throws RemoteException
    {
        super();
    }
    @Override
    public boolean inserer(Gerant gerant) throws RemoteException {
		
		try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
                        session.persist(gerant.getEmploye().getPersonne());
                        session.persist(gerant.getEmploye());
			session.persist(gerant);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
}
}
