/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestion.trelux.DAO;
import gestion.trelux.services.IAdministration;
import gestion.trelux.metier.Administrateur;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class AdministrateurHomeImpl extends UnicastRemoteObject implements IAdministration {
    public  AdministrateurHomeImpl() throws RemoteException
    {
        super();
        }
    @Override
    public boolean inserer(Administrateur administrateur) {
		
		try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
			session.persist(administrateur);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
    
}
}
