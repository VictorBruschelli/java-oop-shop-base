package org.lessons.java.shop;

	    public class Prodotto {
		//dichiaro gli atributi degli oggetti appartenenti alla classe	
		String nome;
		String descrizione;
		double prezzo;
		double iva;
	
	    // creo un atributo che genera un numero randomico tra 0 e 10
        public void codiceR() {
        double doubleRandomNumber = Math.random() * 1000; // Math.random() genera un numero casuale tra 0.0 e 0.999
                                                          // Quindi, Math.random()*1000 è un numero tra 0.0 e 999.999
        // converti il double in numero intero
        int randomNumber = (int)doubleRandomNumber;
        System.out.println("codice prodotto : " + randomNumber);
	}   
      
	    //creo un metodo che permette allutente di specificare il valore allinterno dei tributi
		public void opzioniStringa( String nome, String descrizione ){
		this.nome = nome;
		this.descrizione = descrizione;

		}
		public void opzioniNum(double prezzo , double iva) {
			this.prezzo = prezzo;
			this.iva = iva;
		}
		
		public void info() {
			System.out.println(nome);
			System.out.println(descrizione);
			System.out.println(prezzo);
			System.out.println(iva);
			System.out.println("---------------------");
			
		}

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
/* 
 *    dovevo creare unaltra classe 'main' in cui creavo un metodo conteneva tutti i prodotti e 
 *    che mi richiamava nel server ogni attributo di ogni oggetto 
 *    cosi quando chiamo il metodo 'ogetto1' mi appare nella classe prodotto l'ogetto 1 e tutti i suoi atributi
 */
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