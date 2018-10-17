/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Lignecommandepanier;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author pc
 */
public interface ILignecommandepanier extends Remote{
    public  void addLigne(Lignecommandepanier ligneP) throws RemoteException;
    public  List<Lignecommandepanier> showLigne(String codePanier ) throws RemoteException;
    
}
