package com.teste.evoluun.interfaces;

import org.springframework.boot.SpringApplication;

import com.teste.evoluun.TesteEvoluunApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class EvoluunApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		SpringApplication.run(TesteEvoluunApplication.class);
		
		Pane pane = (Pane)FXMLLoader.load(getClass().getResource("../Fxml/TelaPrincipal.fxml"));
		Scene scene = new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("../arquivos/Evoluun.css").toExternalForm());
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}//class EvoluunApp 
