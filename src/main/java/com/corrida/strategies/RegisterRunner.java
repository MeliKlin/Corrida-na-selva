package com.corrida.strategies;

import com.corrida.enums.Circuit;
import com.corrida.models.Runner;

import java.util.HashMap;
import java.util.Scanner;

public class RegisterRunner implements OptionStrategy {

    private Scanner scanner;

    public RegisterRunner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute(HashMap<Integer, Runner> runners) {
        System.out.println("RegisterRunner strategy foi chamado.");
        int id = runners.size() + 1;
        Runner newRunner = collectData();
        runners.put(id, newRunner);
    }

    public Runner collectData() {
        Runner runner = new Runner();

        System.out.println("Digite o seu RG: ");
        runner.setRg(scanner.next());
        System.out.println("Digite o seu nome: ");
        runner.setNome(scanner.next());
        System.out.println("Digite o seu sobrenome: ");
        runner.setSobrenome(scanner.next());
        System.out.println("Digite a sua idade: ");
        runner.setIdade(scanner.nextInt());
        System.out.println("Digite o seu telefone celular: ");
        runner.setTelefone(scanner.next());
        System.out.println("Digite um contato para emergencia: ");
        runner.setTelEmergencia(scanner.next());
        System.out.println("Digite o seu grupo sanguineo: ");
        runner.setGrupoSanguineo(scanner.next());

        while (runner.getCircuito() == null) {
            defineCircuit(runner);
        }

        return runner;
    }

    private void defineCircuit(Runner runner) {
        int idade = runner.getIdade();
        if (idade > 18) {
            System.out.println("Escolha um circuito:");
            System.out.println("1 - Curto (R$ 1500.00)");
            System.out.println("2 - Medio (R$ 2300.00)");
            System.out.println("3 - Avancado (R$ 2800.00)");
        } else {
            System.out.println("Escolha um circuito:");
            System.out.println("1 - Curto (R$ 1300.00)");
            System.out.println("2 - Medio (R$ 2000.00)");
        }

        int option = scanner.nextInt();
        if (option == 1) {
            runner.setCircuito(Circuit.CURTO);
            return;
        }
        if (option == 2) {
            runner.setCircuito(Circuit.MEDIO);
            return;
        }
        if (option == 3) {
            runner.setCircuito(Circuit.AVANCADO);
        }
    }

}
