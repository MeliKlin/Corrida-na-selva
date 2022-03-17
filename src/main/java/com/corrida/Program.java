package com.corrida;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Corrida na selva");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelecione uma das opcoes abaixo");
            System.out.println("1 - Cadastradar um novo corredor");
            System.out.println("2 - Listar corredores cadastrados");
            System.out.println("3 - Cancelar uma inscricao");
            System.out.println("4 - Finalizar o programa");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Opcao de cadastrar usuario selecionado");
                    break;
                case 2:
                    System.out.println("Opcao de listar corredores selecionado");
                    break;
                case 3:
                    System.out.println("Opcao de cancelar inscricao selecionado");
                    break;
                case 4:
                    System.out.println("Opcao de finalizar o programa selecionado");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcao invalida, tente novamente.");
            }
        }
    }

}
