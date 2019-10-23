/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejlambdamouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class EjLambdaMouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text et1 = new Text(" Programming is fun");
        et1.isFocusTraversable();
        et1.setX(100);
        et1.setY(100);
        et1.setOnMouseDragged(e -> {
             et1.setX(e.getX());
             et1.setY(e.getY());
            
        });
        
        
        Pane root = new Pane();
        root.getChildren().add(et1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
