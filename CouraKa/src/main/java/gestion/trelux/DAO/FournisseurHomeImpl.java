/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Fournisseur;
import gestion.trelux.services.IFournisseur;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class FournisseurHomeImpl extends UnicastRemoteObject implements IFournisseur{
    public FournisseurHomeImpl() throws RemoteException
    {
        super();
    }
    @Override
    public boolean inserer(Fournisseur fournisseur) throws RemoteException{
		
		try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
                        session.persist(fournisseur.getPersonne());
			session.persist(fournisseur);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		} 
}
    public  List<Fournisseur> listFour()
    {
        Session sess=HibernateUtil.getSession();
        List four=sess.createCriteria(Fournisseur.class).setFetchMode("personne", FetchMode.JOIN).list();
        sess.close();
        return four;
    }
} 
