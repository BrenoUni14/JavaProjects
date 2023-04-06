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

        if (estaVazia() == false){
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
            System.out.println("Fila vazia!");
            return null;
        } else {
            Object info = this.inicio.info;
            this.inicio = this.inicio.prox;
            this.tamanho--;

            return info;
        }
    }

    Object inicio(){
            if (estaVazia()){
                System.out.println("Fila vazia!");
                return null;
            }
            else{
                return this.inicio.info;
            }
        }


    }

