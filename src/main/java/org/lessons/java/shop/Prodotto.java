package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float iva;
	
	//alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
	//il codice prodotto sia accessibile solo in lettura
	
	private void CodiceR() {
	    Random codiceRandom = new Random();
		int max = 99999999;
		int result = codiceRandom.nextInt(max);
		System.out.println(codiceRandom);
		}
	
	public int getCodice(){
			return this.codice;
		}
	

	
//	Prodotto(int codice, String nome, String descrizione, float prezzo, float iva){
//		this.codice = codice;
//		this.nome = nome;
//		this.descrizione = descrizione;
//		this.prezzo = prezzo;
//		this.iva = iva;
		
		//}
	public static void main(String[] args) {
		Prodotto mioProdotto= new Prodotto();
		mioProdotto.CodiceR();
	}
	
	
		



        
	
	

	


}
//
//creare la classe Prodotto che gestisce i prodotti dello shop.                             ok
//Un prodotto è caratterizzato da:                                    ok
//codice (numero intero)                                                         ok
//nome                                                                ok
//descrizione                                                                 ok
//prezzo                                                                              ok
//iva ok


//Usate opportunamente i livelli di accesso (public, private),
//i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
//alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//il codice prodotto sia accessibile solo in lettura
//gli altri attributi siano accessibili sia in lettura che in scrittura


//il prodotto esponga un metodo per avere il prezzo base
//il prodotto esponga un metodo per avere il prezzo comprensivo di iva
//il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
//Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità
//della classe Prodotto.
//BONUS:
//Create un metodo (statico) che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri
//(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è



//public static void main(String[] args) {
	// TODO Auto-generated method stub

//}
