/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Lignecommandepanier;
import gestion.trelux.metier.Produit;
import gestion.trelux.services.ILignecommandepanier;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author pc
 */
public class LignecommandepanierHomeImpl extends UnicastRemoteObject implements ILignecommandepanier {
    public  LignecommandepanierHomeImpl() throws RemoteException
    {
        super();
    }
    public  void addLigne(Lignecommandepanier ligneP)
    {
        Session sess=HibernateUtil.getSession();
        Transaction tr=sess.beginTransaction();
        sess.persist(ligneP);
        tr.commit();
        sess.close();
        
        
    }
    public  List<Lignecommandepanier> showLigne(String codePanier )
    {
        Session ses=HibernateUtil.getSession();
        List list=ses.createCriteria(Lignecommandepanier.class).add(Restrictions.eq("panier.codepanier", codePanier)).list();
       ses.close();
        return list;
        
        
    }
   
}
