package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.List;

public class RegisterRunner implements OptionStrategy {

    @Override
    public void execute(List<Runner> runners) {
        System.out.println("RegisterRunner strategy foi chamado.");
    }

}
