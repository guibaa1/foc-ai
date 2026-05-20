package br.com.desafio.model;

public class Meta {

    private int id;
    private String titulo;
    private String descricao;
    private int prazo;
    private Boolean concluida;
    private int progresso;

    public Meta ( Integer id, String titulo, String descricao, Integer prazo, Boolean concluida, Integer progresso){
        this.id = id ;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.concluida = concluida;
        this.progresso = progresso;

    }




}
