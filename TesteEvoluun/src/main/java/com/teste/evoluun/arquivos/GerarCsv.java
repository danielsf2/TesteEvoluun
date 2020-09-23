package com.teste.evoluun.arquivos;

import java.io.FileWriter;
import java.util.List;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GerarCsv {

	private FileWriter writer;
	private String file;
	
	public FileWriter GerarArquivoCsv(List<String> cabecalho, List<List<String>> campos, Stage stage) {
		try {
			FileChooser chooser = new FileChooser();
			file = chooser.showSaveDialog(stage).toString().concat(".csv");
			writer = new FileWriter(file);
			
			for (String string : cabecalho) {
				writer.append(string);
				writer.append(";");
			}
			
			writer.append("\n");
			
			for (List<String> strings : campos) {
				for (String string : strings) {
					writer.append(string);
					writer.append(";");
				}
				writer.append("\n");
			}
			writer.flush();
	        writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return writer;
	}//GerarArquivoCsv() 
	
}//class GerarCsv 
