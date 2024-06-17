package org.lessons.java.shop;

import java.util.Random;


    class Prodotto {
	//dichiaro gli atributi degli oggetti appartenenti alla classe
	String nome;
	String descrizione;
	double prezzo;
	double iva;
	
	// genera numero randomico tra 0 e 10
        void codice() {
	
        // Math.random() genera un numero casuale tra 0.0 e 0.999
        // Quindi, Math.random()*5 è un numero tra 0.0 e 4.999
        double doubleRandomNumber = Math.random() * 10;
       
        // converti il double in numero intero
        int randomNumber = (int)doubleRandomNumber;
        System.out.println("codice prodotto : " + randomNumber);
	}
	
	
	//creo un metodo che permette allutente di specificare il valore allinterno dei tributi
		void opzioniStringa( String nome, String descrizione ){
		this.nome = nome;
		this.descrizione = descrizione;

		}
		void opzioniNum(double prezzo, double iva) {
			this.prezzo = prezzo;
			this.iva = iva;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prodotto sedia = new Prodotto();
		sedia.opzioniStringa("poltrona","bellissima poltrona massaggiatrice");
		sedia.opzioniNum(100.90, 10.19);
		sedia.codice();
		System.out.println(sedia);
	}
	
}
/*
creare la classe Prodotto che gestisce i prodotti dello shop.   ok
Un prodotto è caratterizzato da:
codice (numero intero)
nome
descrizione
prezzo
iva  ok
Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
il prodotto esponga un metodo per avere il prezzo base
il prodotto esponga un metodo per avere il prezzo comprensivo di iva
il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome*/