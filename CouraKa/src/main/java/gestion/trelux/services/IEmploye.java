/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Employe;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEmploye extends Remote {
     public boolean inserer(Employe employe) throws RemoteException;
    
}
