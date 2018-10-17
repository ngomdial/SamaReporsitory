/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestion.trelux.utilitaire;
import gestion.trelux.metier.Familleboisson;
import javafx.scene.control.ListCell;
public class FamilleCell  extends ListCell<Familleboisson>{
    @Override
    protected void updateItem(Familleboisson item, boolean empty){
        super.updateItem(item, empty);
        setText(null);
        if(!empty && item !=null){
            final String text= String.format("%s",item.getCodefamille());
            setText(text);
        }
    }   
}