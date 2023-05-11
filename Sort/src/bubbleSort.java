

public class bubbleSort {

    public static void main(String[] args) {
        int[] vetor = {2, 5, 1, 7, 5, 8};
        bubbleSort(vetor);
    }

    private static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean alterou = false;
        for (int i = 0; i < n - 1; i++) {
            //compara valor atual com o da frente
            for (int j = 0; j < n - i - 1; j++) {
                //se o valor da frente for maior
                if (vetor[j] > vetor[j + 1]) {
                    alterou = true;
                    //faz a troca
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
            if(alterou == false) {
                return;
            }
            else {
                alterou = false;
            }
            System.out.print(vetor[i] + " ");
        }
    }

}
