package br.inatel.cdg;

import br.inatel.cdg.generos.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int i = 0;
        Map<String, String> buscaMapa = new HashMap<String, String>();

        System.out.println("Bem-vindo a Loja de games TudoByte!");
        System.out.println("Por favor, escolha o que deseja fazer:");
        System.out.println("1 - Adicionar um novo jogo");
        System.out.println("2 - Procurar por um jogo específico");
        System.out.println("0 - Sair do sistema.");
        op = sc.nextInt();

        Path arquivo = Paths.get("Catálogo.txt");


        switch (op){
            case 1:{
                String add;
                do{
                    System.out.println("Digite o nome do jogo:");
                    Jogo j = new Jogo();
                    j.setNome(sc.next());
                    System.out.println("Genero do jogo");
                    j.setGenero(sc.next());
                    System.out.println("Informe a plataforma");
                    j.setSistema(sc.next());

                    try {
                        List<String> conteudo = Files.readAllLines(arquivo);
                        Map<String,String> catalogoJogos = new HashMap<>();

                        conteudo.forEach((linha) -> {
                            String[] linhaQuebrada = linha.split("=");
                            try {
                                Files.writeString(arquivo, j.getNome());
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Adicionado!");
                    System.out.println("Deseja adicionar outro jogo? Y/N");
                    add = sc.next();

                }while (add == "Y");
            }
            case 2:{
                System.out.println("Qual o nome do jogo que quer buscar?");
                String nomeJogo = sc.next();


                try {
                    List<String> conteudo = Files.readAllLines(arquivo);
                    Map<String,String> catalogoDeJogos = new HashMap<>();
                    conteudo.forEach((linha) -> {
                        String[] linhaQuebrada = linha.split(nomeJogo);
                        if(linhaQuebrada != null){
                            catalogoDeJogos.forEach((nome, genero) -> {
                                System.out.println("Nome: " + nome);
                                System.out.println("Genero: " + genero);
                            });
                        }
                    });
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
            case 0:
            {
                break;
            }
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }

}
