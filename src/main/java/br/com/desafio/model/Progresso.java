package br.com.desafio.model;
import java.time.LocalDate;

public class Progresso {

    private int id;
    private LocalDate data;
    private int tarefasConcluidas;
    private int tarefasPendentes;
    private int minutosEstudados;
    private double taxaconclusao;

    public Progresso (Integer id, LocalDate data, Integer tarefasConcluidas, Integer tarefasPendentes, Integer minutosEstudados, Double taxaconclusao) {

        this.id = id;
        this.data = data;
        this.tarefasConcluidas = tarefasConcluidas;
        this.tarefasPendentes = tarefasPendentes;
        this.minutosEstudados = minutosEstudados;
        this.taxaconclusao = taxaconclusao;
    }
}
