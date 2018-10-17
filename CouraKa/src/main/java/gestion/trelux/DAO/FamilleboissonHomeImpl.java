package gestion.trelux.DAO;

import gestion.trelux.metier.Familleboisson;
import gestion.trelux.metier.Personne;
import gestion.trelux.services.IFamilleboisson;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class FamilleboissonHomeImpl extends UnicastRemoteObject implements IFamilleboisson{
  
  public  FamilleboissonHomeImpl() throws RemoteException
  {
      super();
  }

    @Override
    public void addFamilleBoisson(Familleboisson fb) throws RemoteException {
      try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
                       // session.persist(fb.getProduits());
			session.persist(fb);
			tr.commit();
			session.close();
		} catch (RuntimeException re) {
		
			throw re;
		}
    
    }
    
   
     public  List<Familleboisson> afficheListFamille(){
         
	        Session session = HibernateUtil.getSession();
	   List boisson=session.createCriteria(Familleboisson.class).list();
                 session.close();
		return boisson;
	       
	    	
	}

  
}
