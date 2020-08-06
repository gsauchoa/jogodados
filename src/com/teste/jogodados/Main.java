package com.teste.jogodados;

public class Main {

    public static void main(String[] args) {
        Dado dado = new Dado(6);

        Resultado[] resultados = Sorteador.sortearGrupos(dado, 3, 3);

        Impressora.imprimir(resultados);
    }
}
