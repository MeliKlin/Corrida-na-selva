package com.corrida.strategies;

import com.corrida.models.Runner;

import java.util.List;

public interface OptionStrategy {

    public void execute(List<Runner> runners);

}
