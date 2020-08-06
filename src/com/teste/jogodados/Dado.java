package com.teste.jogodados;

import java.util.Random;

public class Dado {
    private int lados;
    private Random random;

    public Dado(int lados){
        this.lados = lados;
        random = new Random();
    }

    public int sortear(){
        return random.nextInt(lados) + 1;
    }
}
