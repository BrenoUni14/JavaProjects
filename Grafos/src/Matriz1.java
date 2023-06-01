
public class Matriz1 {

    public static void main(String [] args){
        int [][] matriz = {
                {0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0}
        };

        boolean chegada = busca(5, 7, matriz);
    }

    private static boolean busca(int origem, int destino, int[][] matriz) {
        int nLinhas = matriz.length;
        for (int i = 0; i < nLinhas; i++){
            if (matriz[i][origem] == 1){
                if (i == destino){
                    return true;
                }
            }
        }
    }
}
