/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Lignecommandestock;
import gestion.trelux.metier.Produit;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author pc
 */
public interface ILignecommandestock extends Remote{
     public  void insertLigneProd(Lignecommandestock ligne,Produit prod) throws RemoteException;
     public  void insertLigneProd(Lignecommandestock ligne) throws RemoteException;
    
}
