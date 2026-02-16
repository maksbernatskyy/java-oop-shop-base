package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Locale;

public class Prodotto {
    // Attributi
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;
    private static BigDecimal houndred = new BigDecimal(100);

    // Metodi

    // Constructor
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {

        this.codice = (int)(Math.random() * 100000000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.equals("")) {
            this.nome = nome;
        }
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        if(descrizione != null && !descrizione.equals("")) {
            this.descrizione = descrizione;
        }
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        if(prezzo.compareTo(BigDecimal.ZERO) > 0) {
            this.prezzo = prezzo;
        }
    }

    // Prezzo base
    public void prezzoBase() {
        System.out.println("Il prezzo base è " + this.prezzo);
    }

    // Prezzo base + iva
    public void prezzoPieno() {
        BigDecimal prezzoTotale = this.prezzo.add((this.prezzo.multiply(this.iva).divide(houndred)));
        System.out.printf(Locale.ITALY, "Il prezzo finale è %.2f%n", prezzoTotale);
    }
    
    // Nome esteso
    public void extendedName() {
        System.out.println(this.codice + this.nome);
    }
}
