package br.inatel.cdg.generos;

public abstract class Genero(){
    private String nome;
    private String sistema;
    private String genero;


    public Genero(String nome, String sistema, String genero) {
        this.nome = nome;
        this.sistema = sistema;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
