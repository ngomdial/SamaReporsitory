/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.utilitaire;

import gestion.trelux.metier.Familleboisson;
import gestion.trelux.metier.Lignecommandestock;
import javafx.scene.control.ListCell;

/**
 *
 * @author Fatima
 */

    public class LigneComandeCell  extends ListCell<Lignecommandestock>{
    @Override
    protected void updateItem(Lignecommandestock item, boolean empty){
        super.updateItem(item, empty);
        setText(null);
        if(!empty && item !=null){
            final String text= String.format("%s"," Designation: "+item.getId().getDesignation()+"    "+"Format: "+item.getId().getFormat()+"    "+"Code Produit: "+item.getId().getCodeprod()+"    "+"Quantite: "+item.getQuantite());
            setText(text);
        }
    }   
    
}
