package org.lessons.java.shop;

import java.util.Locale;

public class Prodotto {
    // Attributi
    int codice;
    String nome;
    String descrizione;
    Float prezzo;
    int iva;

    // Metodi

    // Constructor
    Prodotto(String nome, String descrizione, Float prezzo, int iva) {

        this.codice = (int)(Math.random() * 100000000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Prezzo base
    void prezzoBase() {
        System.out.println("Il prezzo base è " + this.prezzo);
    }

    // Prezzo base + iva
    void prezzoPieno() {
        float prezzoTotale = this.prezzo + (this.prezzo * this.iva / 100);
        System.out.printf(Locale.ITALY, "Il prezzo finale è %.2f%n", prezzoTotale);
    }
    
    // Nome esteso
    void extendedName() {
        System.out.println(this.codice + this.nome);
    }
}
