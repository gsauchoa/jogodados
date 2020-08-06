package com.teste.jogodados;

public class Impressora {
    public static void imprimir(Resultado resultado){
        for (int numero : resultado.getNumeros()) {
            System.out.print(numero);
            System.out.print(", ");
        }

        System.out.println(resultado.getSoma());
    }

    public static void imprimir(Resultado[] resultados){
        for (Resultado resultado : resultados) {
            imprimir(resultado);
        }
    }
}
