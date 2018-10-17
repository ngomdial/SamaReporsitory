/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.services.ICommandestock;
import gestion.trelux.metier.Commandestock;
import gestion.trelux.metier.Fournisseur;
import gestion.trelux.metier.Gerant;
import gestion.trelux.metier.Lignecommandestock;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author pc
 */
public class CommandestockHomeImpl extends UnicastRemoteObject implements ICommandestock{
    public CommandestockHomeImpl() throws RemoteException
    {
        super();
    }
    
    public boolean inserer(Commandestock commande) throws RemoteException{
		
		try {
			Session session = HibernateUtil.getSession();
			Transaction tr =session.beginTransaction();                      
			session.persist(commande);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
    
}
     public Commandestock verifComamde(String codestock)
 {
     Session ses=HibernateUtil.getSession();
     Criteria crit=ses.createCriteria(Commandestock.class).add(Restrictions.eq("codestock", codestock)).add(Restrictions.like("etat", "non%"));
     Object o=crit.uniqueResult();
     Commandestock com=(Commandestock)o;
     ses.close();
     return com;
     
 }
     public  List<Lignecommandestock> listeLigneCommande(String stock)
     {
         Session ses=HibernateUtil.getSession();
         List list=ses.createCriteria(Lignecommandestock.class).setFetchMode("commandestock", FetchMode.JOIN).add(Restrictions.eq("id.codestock",stock)).list();
         ses.close();
        return list;
         
     }
     public  List<Commandestock> listCom()
     {
          Session ses=HibernateUtil.getSession();
          List list=ses.createCriteria(Commandestock.class).add(Restrictions.eq("etat", "Non livree")).list();
          ses.close();
         return list;
     }
       public  List<Commandestock> listComProd()
       {
           Session ses=HibernateUtil.getSession();
          List list=ses.createCriteria(Commandestock.class).setFetchMode("produit", FetchMode.JOIN).add(Restrictions.eq("etat"," Non livree")).list();

           ses.close();
            return list;
       }
         public boolean updateProd(Commandestock stock,String etat)
    {
         Session session=HibernateUtil.getSession();
         Transaction tr =session.beginTransaction();
         stock.setEtat(etat);
          session.update(stock);
          tr.commit();
          session.close();
          return true;
    }
    @Override
    public boolean inserer(Commandestock commande, String idf, String gr) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
