package br.com.desafio;
import br.com.desafio.model.Tarefa;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        int opcao = 0;
        Scanner read = new Scanner(System.in);

        do {

            System.out.println("===== FOC.AI =====");
            System.out.println(" 1 - Cadastrar tarefa");
            System.out.println(" 2 - Listar tarefas");
            System.out.println(" 3 - Concluir tarefa");
            System.out.println(" 4 - Cadastrar meta");
            System.out.println(" 5 - Ver progresso");
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
                    break;

                case 4:
                    System.out.println("Cadastrar meta selecionado !!");
                    break;

                case 5:
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
}
