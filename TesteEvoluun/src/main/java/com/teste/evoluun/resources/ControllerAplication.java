package com.teste.evoluun.resources;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.teste.evoluun.arquivos.GerarCsv;
import com.teste.evoluun.models.Municipio;
import com.teste.evoluun.models.UF;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerAplication {
	
	@FXML
    private AnchorPane TelaPrincipal;

	@FXML
    private ComboBox<Municipio> SelectorMunicipios;

    @FXML
    private ComboBox<UF> SelectorEstados;

    @FXML
    private void initialize() {
    	ObservableList<UF> ufs = FXCollections.observableArrayList(new WebRequests().ConsultarEstados());
    	ufs.stream().sorted((x1, x2) -> x1.getNome().compareTo(x2.getNome()));
    	SelectorEstados.setItems(ufs);
    	SelectorEstados.setPromptText("Clique para exibir os dados ...");
    	
    }//initialize
    
    @FXML
    void BoxEstadosSelecionar(ActionEvent event) {
    	ObservableList<Municipio> muns = FXCollections.observableArrayList(new WebRequests().ConsultarMunicipios(SelectorEstados.getValue().getId()));
		muns.stream().forEach(x -> x.getMicroregiao().getMesorregiao().setUF(SelectorEstados.getValue()));
		muns.stream().sorted((x1, x2) -> x1.getNome().compareTo(x2.getNome()));
    	SelectorMunicipios.setItems(muns);
    }//BoxEstadosSelecionar
    
    @FXML
    void BoxMunicipiosSelecionar(ActionEvent event) {
    	try {
    		
    	}catch (Exception e) {
    		JOptionPane.showMessageDialog(null, "Escolha um Estado", "Teste Evoluun", JOptionPane.ERROR_MESSAGE);
    	}
    }//BoxMunicipiosSelecionar
    
    @FXML
    void BtnGerarCsvMunicipiosClick(ActionEvent event) {
    	List<String> cabecalho = new ArrayList<String>();
    	cabecalho.add("Cidade");
    	cabecalho.add("Mesoregiao");
    	cabecalho.add("Nome (Cidade/UF)");
    	List<List<String>> campos = new ArrayList<List<String>>();
    	List<String> campo;
    	
    	for (var dados : SelectorMunicipios.getItems()) {
    		campo = new ArrayList<String>();
    		campo.add(dados.getNome());
			campo.add(dados.getMicroregiao().getMesorregiao().getNome());
			campo.add(dados.getNome()+"/"+dados.getMicroregiao().getMesorregiao().getUF().getSigla());
			campos.add(campo);
		}
    	
    	new GerarCsv().GerarArquivoCsv(cabecalho, campos, new Stage());
    }//BtnGerarCsvClick
    
    @FXML
    void BtnGerarCsvEstadosClick(ActionEvent event) {
    	List<String> cabecalho = new ArrayList<String>();
    	cabecalho.add("Id do Estado");
    	cabecalho.add("Sigla");
    	cabecalho.add("Nome");
    	List<List<String>> campos = new ArrayList<List<String>>();
    	List<String> campo;
    	
    	for (var dados : SelectorEstados.getItems()) {
    		campo = new ArrayList<String>();
    		campo.add(dados.getId());
			campo.add(dados.getSigla());
			campo.add(dados.getRegiao().getNome());
			campos.add(campo);
		}
    	
    	new GerarCsv().GerarArquivoCsv(cabecalho, campos, new Stage());
    }//BtnGerarCsvClick
	
}//class ControllerAplication 
