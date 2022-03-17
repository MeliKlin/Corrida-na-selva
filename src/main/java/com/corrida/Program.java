package com.corrida;

import com.corrida.models.Runner;
import com.corrida.strategies.ListRunners;
import com.corrida.strategies.OptionStrategy;
import com.corrida.strategies.RegisterRunner;
import com.corrida.strategies.RemoveRunner;

import java.util.HashMap;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Corrida na selva");
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Runner> runners = new HashMap<>();

        RegisterRunner registerRunner = new RegisterRunner(scanner);
        ListRunners listRunners = new ListRunners();
        RemoveRunner removeRunner = new RemoveRunner(scanner);

        while (true) {
            System.out.println("\nSelecione uma das opcoes abaixo");
            System.out.println("1 - Cadastradar um novo corredor");
            System.out.println("2 - Listar corredores cadastrados");
            System.out.println("3 - Cancelar uma inscricao");
            System.out.println("4 - Finalizar o programa");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    executeOperation(registerRunner, runners);
                    break;
                case 2:
                    executeOperation(listRunners, runners);
                    break;
                case 3:
                    executeOperation(removeRunner, runners);
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

    private static void executeOperation(OptionStrategy strategy, HashMap<Integer, Runner> runners) {
        strategy.execute(runners);
    }

}
