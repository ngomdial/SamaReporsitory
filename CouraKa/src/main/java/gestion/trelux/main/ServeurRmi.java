/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.main;

import gestion.trelux.DAO.ClientHomeImpl;
import gestion.trelux.DAO.CommandeclientHomeImpl;
import gestion.trelux.DAO.CommandestockHomeImpl;
import gestion.trelux.DAO.ConditionnementHomeImpl;
import gestion.trelux.DAO.FamilleboissonHomeImpl;
import gestion.trelux.DAO.FournisseurHomeImpl;
import gestion.trelux.DAO.LignecommandepanierHomeImpl;
import gestion.trelux.DAO.LignecommandestockHomeImpl;
import gestion.trelux.DAO.PanierHomeImpl;
import gestion.trelux.DAO.PersonneHomeImpl;
import gestion.trelux.DAO.ProduitHomeImpl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import javafx.scene.control.Alert;

/**
 *
 * @author Fatima
 */
public class ServeurRmi {
    public static void main(String[] args) throws RemoteException, MalformedURLException
    {
        try
        {
            LocateRegistry.createRegistry(1900);
            PersonneHomeImpl pers=new PersonneHomeImpl();
             ProduitHomeImpl prodH=new ProduitHomeImpl();
            ClientHomeImpl clientH=new ClientHomeImpl();
            LignecommandepanierHomeImpl lignepanierH=new LignecommandepanierHomeImpl() ;
            CommandeclientHomeImpl cmdclientH=new CommandeclientHomeImpl() ;
            LignecommandestockHomeImpl lignestockH=new LignecommandestockHomeImpl() ;
            CommandestockHomeImpl cmdstockH=new CommandestockHomeImpl();
            FournisseurHomeImpl fourH=new FournisseurHomeImpl();
            FamilleboissonHomeImpl familleH=new FamilleboissonHomeImpl();
            ConditionnementHomeImpl conditionH=new ConditionnementHomeImpl();
            PanierHomeImpl panierH =new PanierHomeImpl() ;
            
            Naming.rebind("rmi://localhost:1900/personne",pers);
            Naming.rebind("rmi://localhost:1900/cmdStock",cmdstockH);
            Naming.rebind("rmi://localhost:1900/client",clientH);
            Naming.rebind("rmi://localhost:1900/lignePanier",lignepanierH);
            Naming.rebind("rmi://localhost:1900/cmdClient",cmdclientH);
            Naming.rebind("rmi://localhost:1900/prod",prodH);
            Naming.rebind("rmi://localhost:1900/ligneStock",lignestockH);
            Naming.rebind("rmi://localhost:1900/four",fourH);
            Naming.rebind("rmi://localhost:1900/famille",familleH);
            Naming.rebind("rmi://localhost:1900/condition",conditionH);
            Naming.rebind("rmi://localhost:1900/panier",panierH);
            
//               Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                   alert.setTitle("Paramétre Serveur ");
//                   alert.setHeaderText("Infomation");
//                   alert.setContentText("Demarage du serveur avec succés");
//                   alert.showAndWait();
        }catch(Exception e){System.out.print("erreur serveur");e.printStackTrace();}
    }
    
}
