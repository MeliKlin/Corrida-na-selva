package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.HashMap;
import java.util.Map;

public class ListRunners implements OptionStrategy {

    @Override
    public void execute(HashMap<Integer, Runner> runners) {
        for (Map.Entry<Integer, Runner> pair: runners.entrySet()) {
            if (pair.getValue().getAtivo()) {
                System.out.println("Corredor " + pair.getKey() + ": " + pair.getValue().printRunner() + "\n");
            }
        }
    }

}
