package br.com.desafio.model;
import java.time.LocalDate;

public class Meta {

    private int id;
    private String titulo;
    private String descricao;
    private LocalDate prazo;
    private boolean concluida;
    private int progresso;

    public Meta ( int id, String titulo, String descricao, LocalDate prazo){
        this.id = id ;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.concluida = false;
        this.progresso = 0;

    }




}
