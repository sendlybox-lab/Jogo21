package br.com.jogo21;

public class GeradorCartas extends Cartas {

    private Object Cartas(Naipe naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
        return naipe.getNome()+valor;
    }
}