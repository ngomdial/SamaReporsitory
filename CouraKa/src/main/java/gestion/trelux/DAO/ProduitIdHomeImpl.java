/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.services.IProduitId;
import gestion.trelux.metier.ProduitId;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProduitIdHomeImpl extends UnicastRemoteObject implements IProduitId {
    public ProduitIdHomeImpl() throws RemoteException{
        super();
    }
    @Override
    public void addProduitId(ProduitId p) throws RemoteException {
    
		try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
                        session.persist(p);
                        tr.commit();
			session.close();
		} catch (RuntimeException re) {
		
			throw re;
		}    
    }
}
