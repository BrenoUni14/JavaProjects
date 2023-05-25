/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulandoarquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManipulandoArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            leituraArquivo();
            escritaArquivo();
        } catch (IOException ex) {
            Logger.getLogger(ManipulandoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    private static void leituraArquivo() throws IOException, FileNotFoundException {
        final String ARQ_ENT = "C:\\Users\\FATEC ZONA LESTE\\Documents\\samba_enredo.txt";
        
        FileReader fr = new FileReader(ARQ_ENT);//lê arquivos existentes
        BufferedReader br = new BufferedReader(fr);//lê o conteudo
        
        String linha = br.readLine();
        while (linha != null) { 
            System.out.println(linha);
            linha = br.readLine();
        }
    }

    private static void escritaArquivo() throws IOException {
        final String ARQ_SAIDA = "C:\\Users\\FATEC ZONA LESTE\\Documents\\saida.txt";
        
        FileWriter fw = new FileWriter(ARQ_SAIDA);//cria aqrquivo
        BufferedWriter bw = new BufferedWriter(fw);
        
        String linha = "primeira linha";
        bw.write(linha); bw.newLine();
        
        linha = "segunda linha";
        bw.write(linha);
        bw.flush();//"commit"
    }
    
    
}
