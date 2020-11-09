package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Parole {
	private List<String> elencoParole= new ArrayList<>() ;
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		elencoParole.add(p);
		
		//TODO
	}
	
	public List<String> getElenco() {
		Collections.sort(elencoParole);
	
		//TODO
		return elencoParole;
	}
	
	public void reset() {
		elencoParole.removeAll(elencoParole);
		// TODO
	}

	public String getElencoParole() {
		
		return elencoParole.toString();
	}
	
	public void remove(String parolaEliminare) {
		elencoParole.remove(parolaEliminare);
	}
	

	
}
