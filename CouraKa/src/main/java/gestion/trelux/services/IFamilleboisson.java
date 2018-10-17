/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Familleboisson;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IFamilleboisson extends Remote {
  public void addFamilleBoisson(Familleboisson fb) throws RemoteException;  
    public  List<Familleboisson> afficheListFamille() throws RemoteException;  
}
