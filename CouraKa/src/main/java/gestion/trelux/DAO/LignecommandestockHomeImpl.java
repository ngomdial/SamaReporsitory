/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Lignecommandepanier;
import gestion.trelux.metier.Lignecommandestock;
import gestion.trelux.metier.Produit;
import gestion.trelux.services.ILignecommandestock;
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
public class LignecommandestockHomeImpl extends UnicastRemoteObject implements ILignecommandestock{
 public  LignecommandestockHomeImpl() throws RemoteException
 {
     super();
 }
 public  void insertLigneProd(Lignecommandestock ligne,Produit prod)
 {
     try{
     Session sess=HibernateUtil.getSession();
     Transaction tx=sess.beginTransaction();
     sess.persist(prod);
         sess.persist(ligne);
  
     tx.commit();
     sess.close();
     }catch(Exception ex ){System.out.print("erreur persist");ex.printStackTrace();}
 }
 public  void insertLigneProd(Lignecommandestock ligne)
 {
     try{
     Session sess=HibernateUtil.getSession();
     Transaction tx=sess.beginTransaction();
         sess.persist(ligne);
  
     tx.commit();
     sess.close();
     }catch(Exception ex ){System.out.print("erreur persist");ex.printStackTrace();}
 }

}
