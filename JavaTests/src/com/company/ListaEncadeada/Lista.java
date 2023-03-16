package com.company.ListaEncadeada;



public class Lista {
    No inicio;
    No fim;
    int tamanho;

    Lista() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    void add(String nome, String tel) {//criando um novo No
        No no = new No(nome, tel);
        if (estaVazia()) {// se lista vazia
            inicio = no;
        } else {
            fim.proximo = no;
        }

        fim = no;
        tamanho++;
    }

    boolean estaVazia() {
        return tamanho == 0;
    }

    String posShow(String nome) {
        No no = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (no.nome.equals(nome)) {
                return no.nome + ": " + no.tel;
            }
            no = no.proximo;
        }
        return "Não Localizado";
    }



    static double mult(double n1, double n2) {
        double resultado = 0;
        for (int i = 0; i < n1; i++) {
            resultado = resultado + n2;
        }
        return resultado;
    }

    static double multrec(double n1, double n2) {
        if (n2 == 1){
            return n1;
        }
        else{
            return n1 + multrec(n1,n2 - 1);
        }

    }

}





