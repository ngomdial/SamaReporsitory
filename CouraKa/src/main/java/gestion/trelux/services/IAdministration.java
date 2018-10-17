/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Administrateur;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAdministration extends Remote{

    boolean inserer(Administrateur administrateur) throws RemoteException;
    
    
}
