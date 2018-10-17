/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Produit;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IProduit extends Remote{
  public void addProduit(Produit p,String idf) throws RemoteException;  
  public  List<Produit> listProduit() throws RemoteException;
  public void insertProduit(Produit prod) throws RemoteException;
  public   Integer listProd(String codeProd) throws RemoteException;
  public   Boolean updateProd(Produit prod,Integer qte) throws RemoteException;
  public  void achatProd(String name,String format,String code,Integer prixA,Integer prixV,String photo,Integer qte) throws RemoteException;

}
