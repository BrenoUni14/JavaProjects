package pilhaDinamica;


public class Pilha {
    int tamanho;
    No topo;

    Pilha() {
        tamanho = 0;
        topo = null;
    }

    boolean estaVazia(){ return tamanho == 0;}

    void empilhar(Object info){
        No no = new No(info);

        if (estaVazia() == false){
            no.ponteiro = topo;
        }

        topo = no;
        tamanho++;
    }

    /*
    Object topo() {
        No no = topo;
        for (int i = 0; i < tamanho; i++) {
            if (estaVazia() == false) {
                return topo.info;
            }
            no = no.ponteiro;
        }
        return "Não Localizado";
    }

     */


    Object topo(){
        if (estaVazia() == true){
            return "Pilha Vazia!";
        }
        else{
            return topo.info;
        }
    }


    Object desempilhar(){
        if (estaVazia() == true){
            Object info = topo.info;
            topo = topo.ponteiro;
            tamanho--;

            return info;
        }

        return "Pilha vazia!";

    }
}
