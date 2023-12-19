package br.edu.iftm.tspi.projetocrud.domain;

import lombok.Data;

@Data
public class Player {
    
    private String nome;
    private String nick;
    private String jogo;
    private String contato;

    public Player() {

    }

    public Player(String nome, String nick, String jogo, String contato) {
        this.nome = nome;
        this.nick = nick;
        this.jogo = jogo;
        this.contato = contato;
    }
}