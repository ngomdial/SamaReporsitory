/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Fatima
 */
public class test extends Application {
    
   GridPane grid=new GridPane();
    JFXTextField ligne;
    JFXTextField qte;
    AnchorPane pane;
    JFXTextField codProd;
    JFXTextField name;
    JFXTextField format;
    @Override
    public void start(Stage primaryStage) {
       
           grid.add(name, 0, 1);
           
              pane.getChildren().add(grid);
             
      
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
