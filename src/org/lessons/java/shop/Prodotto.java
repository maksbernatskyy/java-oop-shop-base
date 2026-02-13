package org.lessons.java.shop;

public class Prodotto {
    // Attributi
    int codice;
    String nome;
    String descrizione;
    Float prezzo;
    int iva;

    // Metodi
    Prodotto(String nome, String descrizione, Float prezzo, int iva) {

        this.codice = (int)(Math.random() * 100000000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
}
