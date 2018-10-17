/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Commandestock;
import gestion.trelux.metier.Lignecommandestock;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author pc
 */
public interface ICommandestock extends Remote {

    boolean inserer(Commandestock commande,String idf,String gr) throws RemoteException;
     public boolean inserer(Commandestock commande) throws RemoteException;
     public Commandestock verifComamde(String codestock) throws RemoteException;
      public boolean updateProd(Commandestock stock,String etat)throws RemoteException; 
       public  List<Commandestock> listCom() throws RemoteException; 
        public  List<Lignecommandestock> listeLigneCommande(String stock) throws RemoteException;
         public  List<Commandestock> listComProd() throws RemoteException;
}
