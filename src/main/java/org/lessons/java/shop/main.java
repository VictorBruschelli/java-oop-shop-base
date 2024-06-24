package org.lessons.java.shop;

public class main {

	public static void main(String[] args) {
		
	
		Prodotto poltrona = new Prodotto("poltrona massaggiatrice","super poltrona massaggiatrice",1800);
		poltrona.info();
		
		
		Prodotto tavolo = new Prodotto("tavolo di oro bianco", "tavolo fabbricato da gnomi nelle valli nordiche",6700);
		tavolo.info();
		
		Prodotto iphone = new Prodotto("ipone x", "150gb, camera 30mpx, resistente all'acqua. ", 800);
		iphone.info();
	}

	}


