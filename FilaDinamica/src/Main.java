import javax.swing.JOptionPane;

public class Main {
    static int op = 0;
    static Fila fila = new Fila();

    public static void main(String[] args) {

        do {
            op = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a opção:"
                            + "\n1 - Enfileirar"
                            + "\n2 - Início"
                            + "\n3 - Desenfileirar"
                            + "\n4 - Toda Fila"
                            + "\n0 - Sair")
            );
            switch (op){
                case 0: break;
                case 1:
                    String tarefa = JOptionPane.showInputDialog("Digite a tarefa: ");
                    fila.enfileirar(tarefa);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, fila.inicio());
                    break;

                case 3:
                    fila.desenfileirar();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, fila.mostrarFila());
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }
        while (op != 0);

    }
}