package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.List;

public class RemoveRunner implements OptionStrategy {

    @Override
    public void execute(List<Runner> runners) {
        System.out.println("RemoveRunner strategy foi chamado");
    }

}
