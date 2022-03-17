package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.HashMap;
import java.util.Map;

public class ListRunners implements OptionStrategy {

    @Override
    public void execute(HashMap<Integer, Runner> runners) {
        System.out.println("ListRunner strategy foi chamado.");

        for (Map.Entry<Integer, Runner> pair: runners.entrySet()) {
            System.out.println("Corredor " + pair.getKey() + ": " + pair.getValue().printRunner() + "\n");
        }
    }

}
