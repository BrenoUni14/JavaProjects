package pilhaDinamica;

public class Main {

    public static void main(String[] args) {
	Pilha pilha = new Pilha();

    pilha.empilhar("Breno");
    pilha.empilhar("Gabi");
    pilha.empilhar("João");

    Object topo = pilha.topo();
    System.out.println(topo);

    pilha.desempilhar();


    }
}
