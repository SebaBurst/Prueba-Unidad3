/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba3;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sebar
 */
public class ProyectoPrueba3 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        respuestas.add("Hola, estoy bien");
        respuestas.add("Mal");
        respuestas.add("No lo se");
        respuestas.add("Quizas");
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static ArrayList<String> mensajes = new ArrayList<>();
    public static ArrayList<String> respuestas = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
     
}
