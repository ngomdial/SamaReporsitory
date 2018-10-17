/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Commandeclient;
import gestion.trelux.services.ICommandeclient;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class CommandeclientHomeImpl extends UnicastRemoteObject implements ICommandeclient{
  public  CommandeclientHomeImpl() throws RemoteException 
  {
      super();
  }
  public void addCommande(Commandeclient cmdClient)
  {
      Session sess=HibernateUtil.getSession();
      Transaction tx=sess.beginTransaction();
      sess.persist(cmdClient);
      tx.commit();
      sess.close();
  }
}
