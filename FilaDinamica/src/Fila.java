import javax.swing.*;

public class Fila {
    int tamanho;
    No inicio;
    No fim;

    Fila() {
        this.tamanho = 0;
        this.inicio = null;
        this.fim = null;
    }


    boolean estaVazia(){
        return tamanho == 0;
    }

    void enfileirar(Object info){
        No no = new No(info);

        if (estaVazia()){
            this.inicio = no;
        }
        else{
            this.fim.prox = no;
        }

        this.fim = no;
        tamanho++;
    }

    Object desenfileirar() {
        if (estaVazia()) {
            JOptionPane.showMessageDialog(null, "Fila vazia!");
            return null;
        } else {
            Object info = this.inicio.info;
            this.inicio = this.inicio.prox;
            this.tamanho--;

            JOptionPane.showMessageDialog(null, "Retirado da Fila!");

            return info;
        }
    }

    Object inicio(){
            if (estaVazia()){
                JOptionPane.showMessageDialog(null, "Fila vazia!");
                return null;
            }
            else{
                return this.inicio.info;
            }
        }

    String mostrarFila() {
        String tarefas = "";
        No noAtual = inicio;
        for (int i = 0; i < tamanho; i++) {
                tarefas += noAtual.info + "\n";
                noAtual = noAtual.prox;
        }
        return tarefas;
    }

    }

