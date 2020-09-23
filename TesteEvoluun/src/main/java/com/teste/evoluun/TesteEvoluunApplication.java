package com.teste.evoluun;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.teste.evoluun.interfaces.EvoluunApp;

import javafx.application.Application;

@SpringBootApplication
public class TesteEvoluunApplication {

	public static void main(String[] args) {
		Application.launch( EvoluunApp.class, args);
	}

}//TesteEvoluunApplication 
