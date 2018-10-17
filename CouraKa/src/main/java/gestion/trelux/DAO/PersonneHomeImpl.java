/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;


import gestion.trelux.metier.Client;
import gestion.trelux.metier.Personne;
import gestion.trelux.services.IPersonne;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author ACTIF
 */
public class PersonneHomeImpl extends UnicastRemoteObject implements IPersonne{
    public  PersonneHomeImpl() throws RemoteException
    {
      super();
    }
    @Override
    public boolean inserer(Personne personne) throws RemoteException {
		
		try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();
			session.persist(personne);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
	}
//     public List<Personne> afficheListclient(){
//	        Session session = HibernateUtil.getSession();
//	       String query1 ="from Personne where categorie='client' ";
//	      // Query query = session.createQuery (query1);
//		List list=query.list();
//		List<Personne> pers=(List<Personne>)list;
//	        session.close();
//	        return pers;	
//	}
         public  List<Personne> afficheListFour(){
	        Session session = HibernateUtil.getSession();
	      List four=session.createCriteria(Personne.class).add(Restrictions.eq("categorie", "fournisseur")).list();
	        session.close();
	        return four;	
	}
    public  Personne connexion(String login,String password)
    {
        
        Session sess=HibernateUtil.getSession();
        Criteria crit=sess.createCriteria(Personne.class);
        crit.add(Restrictions.eq("login", login));
        crit.add(Restrictions.eq("motpasse", password));
        Object o=crit.uniqueResult();
            Personne p=(Personne)o;
           
             sess.close();
        
       return p;
        }

    @Override
    public Client ChercheClient(Personne p) throws RemoteException {
   Session sess=HibernateUtil.getSession();
               Criteria crit1=sess.createCriteria(Client.class);
           crit1.setFetchMode("personne", FetchMode.JOIN);
           crit1.add(Restrictions.eq("id.idpersonne", p.getIdpersonne()));
           Object o1=crit1.uniqueResult();
            Client cl=(Client)o1;
            
            sess.close();
              return cl; 
    }
         
    }
   

