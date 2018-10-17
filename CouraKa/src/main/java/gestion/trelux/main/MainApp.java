/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.main;

import gestion.trelux.DAO.ClientHomeImpl;
import gestion.trelux.DAO.ConditionnementHomeImpl;
import gestion.trelux.DAO.FamilleboissonHomeImpl;
import gestion.trelux.metier.Client;
import gestion.trelux.metier.ClientId;
import gestion.trelux.metier.Conditionnement;
import gestion.trelux.metier.Familleboisson;
import gestion.trelux.metier.Personne;
import java.rmi.RemoteException;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author pc
 */
public class MainApp  {
    
  
     
		
//    private Stage pr   public static void main(String args[])
//	{
//		launch(args);
//		
//	}
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        this.primaryStage=primaryStage;
//        primaryStage.setTitle("TreluxCom");
//        initialisation();
//    }
//    public void initialisation()
//    {
//        try{
//             Parent adam=FXMLLoader.load(Main.class.getResource("/gestion/fxml/Accueil.fxml"));
//              
//              Scene scene=new Scene(adam);
//              primaryStage.setScene(scene);
//              primaryStage.show();
//        }
//        catch(Exception e){e.printStackTrace();}
//       System.out.println("ca marche"); 
//    }
    
// 
//
     
    public static void main(String args []) throws RemoteException{
      
        
//                 Session sess=HibernateUtil.getSession();
//        Query query=sess.createQuery("from Produit  ");
//	    List<Produit> p=null;
//     p=ProduitHomeImpl.listProduitGazeuse();
//     Iterator iter=p.iterator();
//     while(iter.hasNext())
//     {
//         Produit prod=(Produit)iter.next();
//         System.out.print(prod.getPhoto());
//     }
   Set clients=new HashSet(0);
//    FournisseurHomeImpl ch=new FournisseurHomeImpl();
      Personne pers=new Personne();
          Client client=new Client();
          ClientHomeImpl ch=new ClientHomeImpl();
          ClientId cl=new ClientId();
        pers.setNom("Barry");
        pers.setPrenom("Tima");
          pers.setIdpersonne("1119");
          pers.setCategorie("client");
       pers.setAdresse("gdd");
        pers.setEmail("tima@u");
         pers.setLogin("tima@trelux");
          pers.setMotpasse("1234");
//           cl.setCodefour("344lr");
//           cl.setIdpersonne("5119");
//             four.setId(cl);
//            four.setPersonne(pers);
//             four.setSecurefour("2dees");
//            Fours.add(four);
//            pers.setFournisseurs(Fours);
//             ch.inserer(four);

          client.setVip("vip");
          client.setLabel(0);
           client.setPersonne(pers);
           cl.setCodeclient("client1");
           cl.setIdpersonne("1119");
          clients.add(client);
          client.setId(cl);
          client.setCategorie("physique");
          pers.setClients(clients);
          ch.inserer(client);
//          Iterator iter=clients.iterator();
//          while(iter.hasNext())
//          {
//              Client cl1=(Client)iter.next();
//              System.out.println(cl1.getId().getCodeclient());
//          }

//          Panier panier=new Panier();
//         System.out.print( panier.getLignecommandepaniers());
//         
//   Boutique b  = new Boutique();
//    BoutiqueHomeImpl bh = new BoutiqueHomeImpl();
//   b.setNomboutique("boutique poulo");
//   b.setCodeboutique("boutik2");
//  b.setTelephone("77 958 47 71");
//  b.setAdresse("rufiske");
//   b.setEmail("boutik2@trelux.com");
//   bh.inserer(b);
//   Personne p= new Personne();
//   p.setIdpersonne("tima");
//   p.setNom("ba");
//   p.setPrenom("amy");
//   //PersonneHomeImpl ph=new PersonneHomeImpl();
//   // Client cl=new Client();
//    EmployeHomeImpl emplh=new EmployeHomeImpl();
//  EmployeId emplid=new EmployeId();
//  
//   emplid.setIdpersonne(p.getIdpersonne());
//   emplid.setType("gerant");
//    Employe empl=new Employe();
//   empl.setPersonne(p);
//   empl.setId(emplid);
   
   
   
//    Gerant gerant=new Gerant();
//    GerantHomeImpl gerantH=new GerantHomeImpl();
//    GerantId grid=new GerantId();
//    grid.setCodegerant("588553856");
//    grid.setIdpersonne("tima");
//    grid.setType("gerant");
//    gerant.setId(grid);
//    gerant.setEmploye(empl);
//    gerantH.inserer(gerant);
   
//     gerantH.inserer(gerant);
   // ph.inserer(p);
//    cl.setCategorie("morale");
//    cl.setCodeclient("1478");
//    cl.setLabelle(2);
//    cl.setPersonne(p);
//    clh.inserer(cl);
        //empl.setPersonne(p);
      
//    Familleboisson f=new Falleboisson();
//    FamilleboissonHomeImpl fl=new FamilleboissonHomeImpl();
//    f.setAlcool(Boolean.FALSE);
//    f.setCodefamille("famille8");
//    f.setGazeuse(Boolean.FALSE);
//    f.setSucre(Boolean.TRUE);
//    fl.addFamilleBoisson(f);
//    Produit pr1=new Produit();
//    ProduitId pid=new ProduitId();
//    pid.setFormat("10L");
//    pid.setCodeprod("produit");
//    pid.setDesignation("designation");
//    pr1.setFamilleboisson(f);
//   pr1.setDatereception(new Date());
//    pr1.setId(pid);
//    pr1.setSeuilminimum(25);
//    pr1.setPrixunitaire(BigDecimal.ONE);
//    pr1.setQuantiteenstock(20);
//    pr1.setPrixachat(BigDecimal.ZERO);
//    pr1.setDateperemtion(new Date());
//    pr1.setPrixunitaire(BigDecimal.ONE);
    //  pr1.setQuantiteenstock(20);
//    pr1.setPrixachat(BigDecimal.ZERO);
//    ProduitHomeImpl pl=new ProduitHomeImpl();
//    pl.addProduit(pr1);
   // Set<Produit> produits=new HashSet<Produit>();
//    //produits.add(pr1);
    //f.setProduits(produits);
//    ProduitId pid1=new ProduitId();
//   // ProduitIdHomeImpl pih=new ProduitIdHomeImpl();
//    pid1.setCodeprod("produit1");
//    pid1.setDesignation("designation1");
//    pid1.setFormat("33L");
//    //pih.addProduitId(pid);
//     Produit pr=new Produit();
//Fournisseur fr=new Fournisseur();
//FournisseurHomeImpl frh=new FournisseurHomeImpl();
//fr.setCompteur(2);
//fr.setSecurefour("securefour");
//fr.setPersonne(p);
//FournisseurId fri=new FournisseurId();
//fri.setCodefour("codefour1");
//fri.setIdpersonne("fournit5");
//fr.setId(fri);
//frh.inserer(fr);
//Commandestock cm=new Commandestock();
//CommandestockHomeImpl cms=new CommandestockHomeImpl();
//cm.setCodestock("codestock");
//cm.setDatemission(new Date());
//cm.setEtat(Boolean.TRUE);
//cms.inserer(cm, idf, gr)

//Familleboisson famille=new Familleboisson();
//FamilleboissonHomeImpl familleH=new FamilleboissonHomeImpl();
//famille.setAlcool("false");
//famille.setCodefamille("famille03");
//famille.setGazeuse("true");
//famille.setSucre("true");
//familleH.addFamilleBoisson(famille);
//
//Conditionnement condition1=new Conditionnement();
//ConditionnementHomeImpl conditionH=new ConditionnementHomeImpl();
//condition1.setCodecondi("condition03");
//condition1.setLibelle("caisse 6");
//conditionH.addCondition(condition1);
    }
    
}
