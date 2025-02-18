package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    // Método construtor
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath() {
        String numeroCarta = numero + "";
        if (numero == 1) numeroCarta = "Ace";
        else if (numero == 11) numeroCarta = "Jack";
        else if (numero == 12) numeroCarta = "Queen";
        else if (numero == 13) numeroCarta = "King";
        return "classic-cards/" + numero + this.naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

}
 