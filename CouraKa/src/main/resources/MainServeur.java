
import gestion.trelux.DAO.PersonneHomeImpl;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author serigne dial
 */
public class MainServeur {
    public static void main(String [] args) {
        try {
            LocateRegistry.createRegistry(2000);
            PersonneHomeImpl ph =new PersonneHomeImpl();
            Naming.rebind("rmi://localhost:2000/phs",ph);
        } catch (Exception ex) {
            System.out.println("Erreur cote serveur RMI");
        }
    
    }
    
}
