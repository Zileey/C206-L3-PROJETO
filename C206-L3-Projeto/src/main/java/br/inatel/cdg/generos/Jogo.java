package br.inatel.cdg.generos;

public class Jogo extends Genero {

    public static int jogosCriados = 0;

    public Jogo() {
        super(nome, sistema, genero);
    }

    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Plataforma: " + getSistema());
        System.out.println("Genero: " + getGenero());
        System.out.println("Número de jogos: " + jogosCriados++);
    }
}
