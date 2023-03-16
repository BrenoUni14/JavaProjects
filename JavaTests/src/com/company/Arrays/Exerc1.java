package com.company.Arrays;

public class Exerc1 {
    public static void main(String[] args) {
        double salarios[] = {1200, 5000, 7400};

        for (int i = 0; i < salarios.length; i++){
            salarios[i] = salarios[i] + 200;
            System.out.println(salarios[i]);
        }
    }
}
