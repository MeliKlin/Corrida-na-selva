package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.List;
import java.util.Scanner;

public class ListRunners implements OptionStrategy {

    private Scanner scanner;

    public ListRunners(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute(List<Runner> runners) {
        System.out.println("ListRunner strategy foi chamado.");
    }

}
