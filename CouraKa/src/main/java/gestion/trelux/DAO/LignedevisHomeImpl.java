/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.services.ILignedevis;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author pc
 */
public class LignedevisHomeImpl extends UnicastRemoteObject implements ILignedevis{
   
    public  LignedevisHomeImpl() throws RemoteException
    {
        super();
    }
}
