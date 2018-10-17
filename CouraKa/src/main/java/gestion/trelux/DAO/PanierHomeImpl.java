/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Panier;
import gestion.trelux.services.IPanier;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class PanierHomeImpl extends UnicastRemoteObject implements IPanier{
  
    public  PanierHomeImpl() throws RemoteException
    {
        super();
    }
    public void addPanier(Panier p)
    {
        Session sess=HibernateUtil.getSession();
        Transaction tr=sess.beginTransaction();
        sess.persist(p);
        tr.commit();
        sess.close();
        
    }
}
