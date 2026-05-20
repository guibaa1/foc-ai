package br.com.desafio.model;
import java.time.LocalDate;

public class Conquista {

    private int id;
    private String nome;
    private String descricao;
    private boolean desbloqueada;
    private LocalDate dataDesbloqueio;

    public Conquista ( int id, String nome, String descricao ){

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.desbloqueada = false;
        this.dataDesbloqueio = null;

    }


}
