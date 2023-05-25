/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManipulandoArquivo {

    public static void main(String[] args){
        try {
            //leituraArquivo();
            //escritaArquivo();
            //metodoSubString();
            //metodoSplit();
            desafio();
        } catch (IOException ex) {
            Logger.getLogger(ManipulandoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    private static void desafio() throws IOException{
        final String ARQ_ENT = "C:\\Users\\FATEC ZONA LESTE\\Downloads\\entrada.txt";
        FileReader fr = new FileReader(ARQ_ENT);//lê arquivos existentes
        BufferedReader br = new BufferedReader(fr);//lê o conteudo

        String linha = br.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
    }

    private static void metodoSplit() throws IOException{
        /*
        String nomeCompleto = "Breno Santos do Carmo";
        String [] nomes = nomeCompleto.split(" ");
        System.out.println(nomes[1]);
        */
        String dataAmericana = "2020/09/21";
        String [] dataBR = dataAmericana.split("/");
        for (int i = dataBR.length - 1 ; i >= 0; i--){
            System.out.print(dataBR[i] + "/");
        }

    }

    private static void metodoSubString() throws IOException{
        String dataAmericana = "2020/09/21";
        String dia = dataAmericana.substring(8,10);
        String mes = dataAmericana.substring(5,7);
        String ano = dataAmericana.substring(0,4);


        String dataBR = dia+"/"+mes+"/"+ano ;
        System.out.println(dataBR);
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
