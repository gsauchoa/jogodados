package com.teste.jogodados;

public class Sorteador {
    public static Resultado sortearGrupo(Dado dado, int quantidadeNumeros){
        int[] numeros = new int[quantidadeNumeros];

        for(int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = dado.sortear();
        }

        return new Resultado(numeros);
    }

    public static Resultado[] sortearGrupos(Dado dado, int quantidadeNumeros, int quantidadeGrupos){
        Resultado[] resultados = new Resultado[quantidadeGrupos];

        for(int i = 0; i < quantidadeGrupos; i++){
            resultados[i] = sortearGrupo(dado, quantidadeNumeros);
        }

        return resultados;
    }
}
