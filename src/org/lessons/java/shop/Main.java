package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // Nuova scopa
        Prodotto scopa = new Prodotto("Scopa", "Una lunga scopa", 10.5f, 22);

        // Metodo prezzo base
        scopa.prezzoBase();
    }
}
