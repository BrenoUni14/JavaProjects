package com.company.Arrays;

public class Exerc3 {

    public static void main(String[] args) {
        double soma = 0;
        double notas[]={8.6, 9.7, 7.5, 6.7, 8.2, 5.4, 4.3, 7.8};
        int i = 0;

        //somando notas
        for (i = 0; i < notas.length; i++){
            soma = soma + notas[i];
            }

        //calculando média
        double media = soma / notas.length;
        System.out.println("A média é igual a : "+media);
        System.out.println();

        //mostrando notas maiores que a média
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }



    }
}
