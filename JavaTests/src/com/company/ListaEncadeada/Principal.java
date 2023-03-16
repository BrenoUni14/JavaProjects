package com.company.ListaEncadeada;

public class Principal{
    public static void main(String[] args) {
        Lista lista = new Lista();
        /*
        lista.add("Breno", "55");
        lista.add("Rob", "77");
        lista.add("John", "90");
        lista.add("Bea", "2020");

        String tel = lista.posShow("Breno");
        System.out.println(tel);

        tel = lista.posShow("Ana");
        System.out.println(tel);
        */

        double mult = lista.multrec(4, 3);
        System.out.println(mult);


    }
}

