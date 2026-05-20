package br.com.desafio;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int opcao = 0;
        Scanner read = new Scanner(System.in);

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

        switch (opcao){

            case 0 :
                System.out.println("Saindo do menu");
                break;

            case 1 :
                System.out.println("Cadastrar tarefa selecionado !!");
                break;

            case 2:
                System.out.println("Listar tarefa selecionado !!");
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
        }

        read.close();
    }
}
