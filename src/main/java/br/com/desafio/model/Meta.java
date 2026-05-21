package br.com.desafio.model;
import java.time.LocalDate;

public class Meta {

    private int id;
    private String titulo;
    private String descricao;
    private LocalDate prazo;
    private boolean concluida;
    private int progresso;

    public Meta (int id, String titulo, String descricao, LocalDate prazo){
        this.id = id ;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.concluida = false;
        this.progresso = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getProgresso() {
        return progresso;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }

}
