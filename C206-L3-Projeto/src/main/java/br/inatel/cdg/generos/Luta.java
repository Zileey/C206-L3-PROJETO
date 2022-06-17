package br.inatel.cdg.generos;

import br.inatel.cdg.interfaces.Console;

public class Luta extends Personagem implements Console, SinglePlayer {
    private String tamanhoDoCabelo;

    public String Motivar(){
        System.out.println("Motivando");
    }

    public String getTamanhoDoCabelo() {
        return tamanhoDoCabelo;
    }

    public void setTamanhoDoCabelo(String tamanhoDoCabelo) {
        this.tamanhoDoCabelo = tamanhoDoCabelo;
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tamanho do cabelo: "+ tamanhoDoCabelo);
    }

    @Override
    public void ForTheAlliance() {
        System.out.println("Pela Aliança!");
    }

    @Override
    public void InvadirHorda() {
        System.out.println("Invadindo Orgrimmar");
    }

    @Override
    public void SacarArma() {
        System.out.println("Desembanhando a espada");
    }
}
