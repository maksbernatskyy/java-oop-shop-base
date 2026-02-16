package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Nuova scopa
        Prodotto scopa = new Prodotto("Scopa", "Una lunga scopa", new BigDecimal("10.5"), new BigDecimal("22"));

        // Metodo prezzo base
        scopa.prezzoBase();

        // Metodo prezzo totale 
        scopa.prezzoPieno();

        // Metodo nome esteso
        scopa.extendedName();

        // Change name
        scopa.setNome("Bella scopa");
        System.out.println(scopa.getNome());
    }
}
