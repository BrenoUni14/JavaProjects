package com.company.ListaEncadeada;

public class No {
    String nome;
    String tel;
    No proximo;

    No(String nome, String tel){
        this.nome = nome;
        this.tel = tel;
        proximo = null;
    }


}
