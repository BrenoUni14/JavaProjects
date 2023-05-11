
public class main {

    public static void main(String [] args){

        int[] vetor = {7, 9, 5, 6, 8, 2};
        selectionSort(vetor);
    }

    private static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++){
            int menor = Integer.MAX_VALUE;
            int iMenor = i;
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    iMenor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = menor;
            vetor[iMenor] = temp;

            System.out.print(vetor[i] + " ");
        }

    }


}
