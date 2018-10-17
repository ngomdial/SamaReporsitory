/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Produit;
import gestion.trelux.services.IProduit;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author pc
 */
public class ProduitHomeImpl extends UnicastRemoteObject implements IProduit{
 
    public  ProduitHomeImpl() throws RemoteException
    {
        super();
    }

    public  List<Produit> listProduit() throws RemoteException {
        Session sess=HibernateUtil.getSession();
        Query query=sess.createQuery("from Produit ");
        List list=query.list();
        List<Produit> prod=(List<Produit>)list;
        sess.close();
        return prod;
         
    }
 

    public void insertProduit(Produit prod) {
        try{
             Session session=HibernateUtil.getSession();
             Transaction tr =session.beginTransaction();
         
             session.persist(prod);
             
             tr.commit();
             session.close();
             
        }catch(RuntimeException re){re.printStackTrace();}
    }
 public  Integer listProd(String codeProd)
    {
          Session ses=HibernateUtil.getSession();
          Criteria crit=ses.createCriteria(Produit.class).add(Restrictions.eq("id.codeprod", codeProd));
          Object o=crit.uniqueResult();
          Produit prod=(Produit)o;
              ses.close();
        
        return prod.getPrixvente();
        
    }
    @Override
    public void addProduit(Produit p, String idf) throws RemoteException {
    }
    public   Boolean updateProd(Produit prod,Integer qte)
    {
         Session session=HibernateUtil.getSession();
         Transaction tr =session.beginTransaction();
          prod.setQuantiteenstock(prod.getQuantiteenstock()-qte);
          session.update(prod);
          tr.commit();
          session.close();
          return true;
    }
    public  void achatProd(String name,String format,String code,Integer prixA,Integer prixV,String photo,Integer qte)
    {
        Session session=HibernateUtil.getSession();
         Transaction tr =session.beginTransaction();
         Criteria crit=session.createCriteria(Produit.class).add(Restrictions.eq("id.codeprod", code)).add(Restrictions.eq("id.format", format)).add(Restrictions.eq("id.designation", name));
         Object o=crit.uniqueResult();
         Produit prod=(Produit)o;
         if(prod.getQuantiteenstock()!=0)
         {
             prod.setQuantiteenstock(prod.getQuantiteenstock()+qte);
         }
         else
         {
         prod.setPhoto(photo);
         prod.setQuantiteenstock(qte);
         prod.setPrixachat(prixA);
         prod.setPrixvente(prixV);
         prod.setSeuilminimum(5);
         session.update(prod);
         }
           tr.commit();
           session.close();
            
    }
}
