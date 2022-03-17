package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.List;
import java.util.Scanner;

public class RemoveRunner implements OptionStrategy {

    private Scanner scanner;

    public RemoveRunner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute(List<Runner> runners) {
        System.out.println("RemoveRunner strategy foi chamado");
    }

}
