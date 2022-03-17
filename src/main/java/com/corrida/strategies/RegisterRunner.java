package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.List;
import java.util.Scanner;

public class RegisterRunner implements OptionStrategy {

    private Scanner scanner;

    public RegisterRunner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute(List<Runner> runners) {
        System.out.println("RegisterRunner strategy foi chamado.");
    }

}
