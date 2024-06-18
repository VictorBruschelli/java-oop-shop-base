package org.lessons.java.shop;

public class main {

	public static void main(String[] args) {
		
	
		Prodotto sedia = new Prodotto();
		sedia.opzioniStringa("poltrona","bellissima poltrona massaggiatrice");
		sedia.opzioniNum(100.90, 10.19);
		sedia.codiceR();
		
		sedia.info();
		
		Prodotto tavolo = new Prodotto();
		tavolo.opzioniStringa("tavolo di oro", "tavolo di oro bianco fabricato nelle montagne orientali");
		tavolo.opzioniNum(5000, 80);
		tavolo.codiceR();
		
		tavolo.info();
		
	}

	}


