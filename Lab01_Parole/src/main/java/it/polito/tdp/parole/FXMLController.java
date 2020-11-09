package it.polito.tdp.parole;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco =new Parole();
	Long time1;
	Long time2;
	Long resultT;

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtParola;

	    @FXML
	    private Button btnInserisci;

	    @FXML
	    private TextArea txtResult;

	    @FXML
	    private Button btnCancella;

	    @FXML
	    private Button btnReset;

	    @FXML
	    private TextArea txtTime;
	    @FXML
	    	
	    
	    void doCancel(ActionEvent event) {
	    	txtTime.clear();
	    	time1=System.nanoTime();
	    	String cancella= txtResult.getSelectedText();
	    	System.out.println(cancella);
	    	elenco.remove(cancella);
	    	txtResult.setText(elenco.getElencoParole());
	    	time2=System.nanoTime();
	    	resultT=time2-time1;
	    	txtTime.setText("Tempo impiegato per cancellare "+resultT.toString()+" nano secondi");
	    	
	    }

	    @FXML
	    void doInsert(ActionEvent event) {
	    	txtTime.clear();
	    	time1=System.nanoTime();
	    	elenco.addParola(txtParola.getText());
	    	elenco.getElenco();
	    	txtResult.setText(elenco.getElencoParole());
	    	time2=System.nanoTime();
	    	resultT=time2-time1;
	    	txtTime.setText("Tempo impiegato per inserire "+resultT.toString()+" nano secondi");
	    	// TODO
	    }

	    @FXML
	    void doReset(ActionEvent event) {
	    	txtTime.clear();
	    	time1=System.nanoTime();
	    	elenco.reset();
	    	txtResult.clear();
	    	txtParola.clear();
	    	time2=System.nanoTime();
	    	resultT=time2-time1;
	    	txtTime.setText("Tempo impiegato per cancellare tutto "+resultT.toString()+" nano secondi");
	    	// TODO
	    	// TODO
	    }


	    @FXML
	    void initialize() {
	        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";

	    }
	}


   

   

   
    









  