/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.services.ICalendrierservice;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author pc
 */
public class CalendrierserviceHomeImpl extends UnicastRemoteObject implements ICalendrierservice{
 
    public CalendrierserviceHomeImpl() throws RemoteException
    {
        super();
    }
}
