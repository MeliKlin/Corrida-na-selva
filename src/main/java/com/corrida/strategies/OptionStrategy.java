package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.HashMap;

public interface OptionStrategy {

    public void execute(HashMap<Integer, Runner> runners);

}
