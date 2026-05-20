package br.com.desafio.model;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private int nivel;

    public Usuario (Integer id, String nome, String email, String senha, Integer nivel){

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivel = nivel;
    }


}
