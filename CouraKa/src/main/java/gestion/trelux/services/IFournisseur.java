/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Fournisseur;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IFournisseur extends Remote{
    boolean inserer(Fournisseur fournisseur) throws RemoteException;
     public  List<Fournisseur> listFour() throws RemoteException;
}
