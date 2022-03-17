package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.List;

public class ListRunners implements OptionStrategy {

    @Override
    public void execute(List<Runner> runners) {
        System.out.println("ListRunner strategy foi chamado.");
    }

}
