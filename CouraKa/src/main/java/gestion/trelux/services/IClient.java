/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Client;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author pc
 */
public interface IClient  extends Remote{
     public boolean inserer(Client client) throws RemoteException;
    
}
