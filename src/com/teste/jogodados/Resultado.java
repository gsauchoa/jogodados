package com.teste.jogodados;

public class Resultado {
    private int[] numeros;

    public Resultado(int[] numeros){
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getSoma(){
        int acumulador = 0;

        for(int numero : numeros) {
            acumulador += numero;
        }

        return acumulador;
    }
}
