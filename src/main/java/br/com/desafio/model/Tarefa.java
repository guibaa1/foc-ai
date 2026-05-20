package br.com.desafio.model;
import java.time.LocalDate;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;
    private LocalDate data;

    public Tarefa ( int id, String titulo, String descricao, LocalDate data){


        this.id = id;
        this.titulo = titulo;
        this.descricao  = descricao;
        this.data = data;
        this.concluida = false;
    }
}
