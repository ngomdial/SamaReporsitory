package gestion.trelux.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainAPP_1 extends Application{

	public static void main(String[] args) {
//	
//		FormatHome home=new FormatHome();
//	Format format=new Format("00034");
//		home.insererFormat(format);
//		
                launch(args);
	 
		

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent chemin=FXMLLoader.load(getClass().getResource("/gestion/trelux/fxml/entrees.fxml"));
		Scene scene=new Scene(chemin);
		stage.setScene(scene);
		stage.show();
		
	}

}
