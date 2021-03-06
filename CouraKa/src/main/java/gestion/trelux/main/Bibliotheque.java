/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javax.imageio.ImageIO;

/**
 *
 * @author ACTIF
 */
public class Bibliotheque {
    public String buttonRadio(RadioButton f,RadioButton m)
    {  String sexe = null;
        if(f.isSelected())
	{
            m.setSelected(false);
            sexe =  f.getText();
	}
	else if(m.isSelected())
	{
            f.setSelected(false);
            sexe =  m.getText();
	}
        return sexe;
    }
    
    public static String chargingAndMovingPicture(ImageView photo, String nom) throws IOException 
    {
         BufferedImage image;
       FileChooser fileChooser = new FileChooser();
       fileChooser.getExtensionFilters().addAll(
    	    	new ExtensionFilter("*.JPG", "*.jpg"),
    	    	new ExtensionFilter("*.PNG", "*.png"),
    	    	new ExtensionFilter("*.GIF", "*.gif"));
       File file = fileChooser.showOpenDialog(photo.getScene().getWindow());
       
       String fic = file.getAbsolutePath();
       String recup = fic.toString().substring(fic.length()-3,fic.length());
       
       //URL url = new URL(fic);
       image = ImageIO.read(file);
       int num = (int) (Math.random()*500000);
       String nomImage = nom+"_"+num+"."+recup;
       ImageIO.write(image, recup, new File(nomImage));
		 
		// --> file:/C:/MyImages/myphoto.jpg
		String localUrl = null;
		try 
		{
			localUrl = file.toURI().toURL().toString();
		} 
		catch (MalformedURLException e) 
		{
			System.out.println("Chemin d'acces a un probleme!");
		}
		Image image2 = new Image(localUrl);
		photo.setImage(image2);
	    return nomImage;
	}
}
