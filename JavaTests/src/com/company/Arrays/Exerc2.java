package com.company.Arrays;

import java.util.Random;

public class Exerc2 {
    public static void main(String[] args) {


        String nomes[]={"Maria", "João", "Tiago"};

        //apresentando o array principal
        System.out.println("Array principal");
        for (int i=0; i < nomes.length; i++) {
            System.out.println("nome[" + i + "]= " + nomes[i]);
        }
        System.out.println();

        //passando pro array auxiliar em ordem inversa
        System.out.println("Array auxiliar");
        String[] nomes2 = new String[nomes.length];
        for (int i = nomes2.length - 1; i >= 0; i-- ){
            nomes2[i] = nomes[i];
            System.out.println("nome[" + i + "]= " + nomes2[i]);
        }
        System.out.println();



    }
}
