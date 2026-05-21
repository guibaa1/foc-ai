package br.com.desafio;
import br.com.desafio.model.Meta;
import br.com.desafio.model.Tarefa;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        ArrayList<Meta> metas = new ArrayList<>();


        int opcao = 0;
        Scanner read = new Scanner(System.in);

        do {

            System.out.println("===== FOC.AI =====");
            System.out.println(" 1 - Cadastrar tarefa");
            System.out.println(" 2 - Listar tarefas");
            System.out.println(" 3 - Concluir tarefa");
            System.out.println(" 4 - Cadastrar meta");
            System.out.println(" 5 - Listar metas");
            System.out.println(" 6 - Ver progresso");
            System.out.println(" 0 - Sair");
            System.out.println(" ");
            System.out.print(" Digite a opçao desejada: ");

            opcao = read.nextInt();

            System.out.println(" ");

            switch (opcao) {

                case 0:
                    System.out.println("Saindo do menu");
                    break;

                case 1:
                    System.out.println("Cadastrar tarefa selecionado !!");
                        cadastrarTarefa(read, tarefas);
                    break;

                case 2:
                    System.out.println("Listar tarefa selecionado !!");
                        listarTarefas(tarefas);
                    break;

                case 3:
                    System.out.println("Concluir tarefa selecionado !!");
                        concluirTarefa(tarefas, read);
                    break;

                case 4:
                    System.out.println("Cadastrar meta selecionado !!");
                        cadastrarMeta(read, metas);
                    break;

                case 5:
                    System.out.println("Listar metas selecionado !!");
                        listarMetas(metas);
                    break;
                case 6:
                    System.out.println("Ver progresso selecionado !!");
                    break;

                default:
                    System.out.println("Digito inválido, tente novamente!!\n");
                    break;
            }
        }

        while(opcao != 0);


        read.close();
    }

    public static void cadastrarTarefa(Scanner read, ArrayList<Tarefa> tarefas) {

        read.nextLine();

        System.out.print("Digite o título da tarefa: ");
        String titulo = read.nextLine();

        System.out.print("Digite a descrição da tarefa: ");
        String descricao = read.nextLine();

        LocalDate data = LocalDate.now();

        Tarefa tarefa = new Tarefa(tarefas.size() + 1, titulo, descricao, data);

        tarefas.add(tarefa);

        System.out.println("Tarefa cadastrada com sucesso!\n");
    }
    public static void listarTarefas(ArrayList<Tarefa> tarefas) {

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.\n");
            return;
        }

        System.out.println("===== LISTA DE TAREFAS =====");

        for (Tarefa tarefa : tarefas) {
            System.out.println("ID: " + tarefa.getId());
            System.out.println("Título: " + tarefa.getTitulo());
            System.out.println("Descrição: " + tarefa.getDescricao());
            System.out.println("Data: " + tarefa.getData());
            System.out.println("Concluída: " + tarefa.isConcluida());
            System.out.println("----------------------------");
        }
}

    public static void concluirTarefa(ArrayList<Tarefa> tarefas, Scanner read) {

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada para concluir.\n");
            return;
        }

        System.out.print("Digite o ID da tarefa que deseja concluir: ");
        int id = read.nextInt();

        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.concluir();
                System.out.println("Tarefa concluída com sucesso!\n");
                return;
            }
        }

        System.out.println("Tarefa não encontrada.\n");
    }

    public static void cadastrarMeta(Scanner read, ArrayList<Meta> metas) {

        read.nextLine();

        System.out.print("Digite o título da meta: ");
        String titulo = read.nextLine();

        System.out.print("Digite a descrição da meta: ");
        String descricao = read.nextLine();

        LocalDate prazo = LocalDate.now();

        Meta meta = new Meta(metas.size() + 1, titulo, descricao, prazo);

        metas.add(meta);

        System.out.println("Meta cadastrada com sucesso!\n");
    }

    public static void listarMetas(ArrayList<Meta> metas) {

        if (metas.isEmpty()) {
            System.out.println("Nenhuma meta cadastrada.\n");
            return;
        }

        System.out.println("===== LISTA DE METAS =====");

        for (Meta meta : metas) {
            System.out.println("ID: " + meta.getId());
            System.out.println("Título: " + meta.getTitulo());
            System.out.println("Descrição: " + meta.getDescricao());
            System.out.println("Prazo: " + meta.getPrazo());
            System.out.println("Concluída: " + meta.isConcluida());
            System.out.println("Progresso: " + meta.getProgresso() + "%");
            System.out.println("----------------------------");
        }
    }
}
