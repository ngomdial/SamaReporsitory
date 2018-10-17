/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.utilitaire;

import gestion.trelux.metier.Familleboisson;
import gestion.trelux.metier.Produit;
import javafx.scene.control.ListCell;

/**
 *
 * @author Fatima
 */
public class ProduitCell extends ListCell<Produit> {
 
    @Override
    protected void updateItem(Produit item, boolean empty){
        super.updateItem(item, empty);
        setText(null);
        if(!empty && item !=null){
            final String text= String.format("%s",item.getId().getDesignation()+" "+item.getId().getFormat());
            setText(text);
        }
    }   
}
