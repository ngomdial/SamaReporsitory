/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.services.IPrivilege;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author pc
 */
public class PrivilegeHomeImpl extends UnicastRemoteObject implements IPrivilege{
    public PrivilegeHomeImpl() throws RemoteException
    {
        super();
    }
}
