package com.company.ExercLaços;

public class Exerc11 {

    public static void main(String[] args) {
        //Fibonacci Sequence

        int atual = 1;
        int ant = 0;

        while(atual < 1000){
            atual = atual + ant;
            System.out.println(atual);
            ant = atual - ant;

        }
    }
}
