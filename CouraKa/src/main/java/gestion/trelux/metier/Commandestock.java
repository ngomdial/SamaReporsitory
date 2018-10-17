package gestion.trelux.metier;
// Generated 24 mai 2018 11:55:21 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Commandestock generated by hbm2java
 */
public class Commandestock  implements java.io.Serializable {


     private String codestock;
     private Fournisseur fournisseur;
     private String datemission;
     private String etat;
     private String datereception;
     private String datealivre;
     private Set devises = new HashSet(0);
     private Set lignecommandestocks = new HashSet(0);
     private Set facturefournisseurs = new HashSet(0);

    public Commandestock() {
    }

	
    public Commandestock(String codestock) {
        this.codestock = codestock;
    }
    public Commandestock(String codestock, Fournisseur fournisseur, String datemission, String etat, String datereception, String datealivre, Set devises, Set lignecommandestocks, Set facturefournisseurs) {
       this.codestock = codestock;
       this.fournisseur = fournisseur;
       this.datemission = datemission;
       this.etat = etat;
       this.datereception = datereception;
       this.datealivre = datealivre;
       this.devises = devises;
       this.lignecommandestocks = lignecommandestocks;
       this.facturefournisseurs = facturefournisseurs;
    }
   
    public String getCodestock() {
        return this.codestock;
    }
    
    public void setCodestock(String codestock) {
        this.codestock = codestock;
    }
    public Fournisseur getFournisseur() {
        return this.fournisseur;
    }
    
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
    public String getDatemission() {
        return this.datemission;
    }
    
    public void setDatemission(String datemission) {
        this.datemission = datemission;
    }
    public String getEtat() {
        return this.etat;
    }
    
    public void setEtat(String etat) {
        this.etat = etat;
    }
    public String getDatereception() {
        return this.datereception;
    }
    
    public void setDatereception(String datereception) {
        this.datereception = datereception;
    }
    public String getDatealivre() {
        return this.datealivre;
    }
    
    public void setDatealivre(String datealivre) {
        this.datealivre = datealivre;
    }
    public Set getDevises() {
        return this.devises;
    }
    
    public void setDevises(Set devises) {
        this.devises = devises;
    }
    public Set getLignecommandestocks() {
        return this.lignecommandestocks;
    }
    
    public void setLignecommandestocks(Set lignecommandestocks) {
        this.lignecommandestocks = lignecommandestocks;
    }
    public Set getFacturefournisseurs() {
        return this.facturefournisseurs;
    }
    
    public void setFacturefournisseurs(Set facturefournisseurs) {
        this.facturefournisseurs = facturefournisseurs;
    }




}


