/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.services.ILivraison;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author pc
 */
public class LivraisonHomeImpl extends UnicastRemoteObject implements ILivraison{
 public  LivraisonHomeImpl() throws RemoteException
 {
     super();
 }
}
