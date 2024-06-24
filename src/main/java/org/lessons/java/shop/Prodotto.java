package org.lessons.java.shop;

	    public class Prodotto {
		//creo delle variabili di istanzza	
		String nome;
		String descrizione;
		static double prezzo;
		static double iva;
	
	    // creo un atributo che genera un numero randomico tra 0 e 10
        public static int codiceR() {
        double doubleRandomNumber = Math.random() * 1000; // Math.random() genera un numero casuale tra 0.0 e 0.999
                                                          // Quindi, Math.random()*1000 è un numero tra 0.0 e 999.999
        // converti il double ing numero intero
        int randomNumber = (int)doubleRandomNumber;
		return randomNumber;
        }   
        
        public static int calcoloIva() {
//        	Un'altra opzione è dividere il prezzo netto per 100 e poi moltiplicarlo per 122.
        	if ( prezzo > 0) {
        	 iva = prezzo / 100 * 122;
//        	 System.out.println(iva);
        	}
			return (int) iva;	
        }
        
		public static int valoreIva() {
			if ( iva > 0) {
			iva = (int) (iva - prezzo); 
			}
			return (int) iva;
		}
		
      
	    //creo un metodo che permette allutente di specificare il valore allinterno dei tributi
		Prodotto( String nome, String descrizione, double prezzo ){
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;

		}
//		public void opzioniNum(double prezzo , double iva) {
//			this.prezzo = prezzo;
//			this.iva = iva;
//		}
		
		public void info() {
			System.out.println("codice prodotto: " + Prodotto.codiceR() + " - " + nome);
			System.out.println("Descrizione: \n" + descrizione);
			System.out.println("Prezzo: \n" + prezzo + "$");
			System.out.println("Totale complessivo " + Prodotto.calcoloIva() + "$");
			System.out.println("Di cui IVA " + Prodotto.valoreIva() + "$");
			System.out.println("---------------------");
			
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