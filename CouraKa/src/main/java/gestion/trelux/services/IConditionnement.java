/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Conditionnement;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IConditionnement extends Remote{
     public  List<Conditionnement> listeCondition() throws RemoteException;
       public void addCondition(Conditionnement con) throws RemoteException;
    
}
