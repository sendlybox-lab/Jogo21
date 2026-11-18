package br.com.jogo21;

abstract class Cartas {
    Naipe naipe;
    int valor;


    private void Cartas(Naipe naipe, int valor)
    {
        this.naipe = naipe;
        this.valor = valor;
    }
}