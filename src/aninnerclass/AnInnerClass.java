/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aninnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author chris
 */
public class AnInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button nuevo = new Button();
        nuevo.setText("Nuevo");
        Button abrir = new Button();
        abrir.setText("Abrir");
        Button guardar = new Button();
        guardar.setText("Guardar");
        Button imprimir = new Button();
        imprimir.setText("Imprimir");
        
        nuevo.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e) {
            System.out.println("Nuevo Proceso");
            }
        });
        
        abrir.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e) {
            System.out.println("Abrir proceso");
            }
        });
        
        guardar.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e) {
            System.out.println("Guardar proceso");
            }
        });
        
        imprimir.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e) {
            System.out.println("Imprimir proceso");
            }
        });
        
        HBox root = new HBox(nuevo,abrir,guardar,imprimir);
        root.setSpacing(5.0);
        root.setPadding(new Insets(5.0));
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 250, 100);
        
        primaryStage.setTitle("AnnonymousHandlerDemo");
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
