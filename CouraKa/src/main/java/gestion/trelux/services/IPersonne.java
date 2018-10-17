/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Client;
import gestion.trelux.metier.Personne;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IPersonne extends Remote{
    public boolean inserer(Personne personne) throws RemoteException;
    public  List<Personne> afficheListFour() throws RemoteException;
    public  Personne connexion(String login,String password) throws RemoteException;
    public Client ChercheClient(Personne p) throws RemoteException;
}
