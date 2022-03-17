package com.corrida.models;

import com.corrida.enums.Circuit;

public class Runner {

    private String rg;
    private String nome;
    private String sobrenome;
    private int idade;
    private String telefone;
    private String telEmergencia;
    private String grupoSanguineo;
    private boolean ativo = true;
    private Circuit circuito = null;

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() { return  idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public void setTelEmergencia(String telEmergencia) { this.telEmergencia = telEmergencia; }

    public void setGrupoSanguineo(String grupoSanguineo) { this.grupoSanguineo = grupoSanguineo; }

    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public Circuit getCircuito() { return circuito; }

    public void setCircuito(Circuit circuito) {
        this.circuito = circuito;
    }

    public String printRunner() {
        return "\nNome: " + this.nome + " " + this.sobrenome +
                "\nRG: " + this.rg +
                "\nIdade: " + this.idade +
                "\nCelular: " + this.telefone +
                "\nEmergencia: "+ this.telEmergencia +
                "\nGrupo Sanguine: " + this.grupoSanguineo +
                "\nCircuito: " + this.circuito;
    }
}
