package br.com.desafio.model;
import java.time.LocalDate;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private Boolean concluido;
    private LocalDate data;

    public Tarefa ( Integer id, String titulo, String descricao, LocalDate data, Boolean concluido){


        this.id = id;
        this.titulo = titulo;
        this.descricao  = descricao;
        this.data = data;
        this.concluido = concluido;
    }
}
