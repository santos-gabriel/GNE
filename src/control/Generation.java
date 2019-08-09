package control;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @version V2.0
 * @author gabriel
 */
public class Generation {

    /**
     * Classe pai destinada a leitura dos arquivos Classe possui metodos onde
     * sera gerado um retorno de array contendo os dados dos respectivos
     * arquivos lidos
     */
    private static ArrayList<String> Read(String endereco) {

        ArrayList<String> conteudo = new ArrayList();

        try {

            Reader arquivo = null;

            try {
                arquivo = new InputStreamReader(new FileInputStream(endereco), "ISO-8859-1");
            } catch (UnsupportedEncodingException ex) {
                JOptionPane.showMessageDialog(null, "ERROR\nNão foi possivel ler o arquivo: " + ex);
            }

            BufferedReader leitura = new BufferedReader(arquivo);

            String linha = "";

            try {

                linha = leitura.readLine();

                while (linha != null) {

                    conteudo.add(linha);
                    linha = leitura.readLine();

                }

                arquivo.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "ERROR\nNão foi possivel ler o arquivo: " + ex);
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR\nArquivo não encontrado: " + ex);
        }

        return conteudo;

    }

    public static ArrayList<String> getRead(String caminho) {

        ArrayList<String> conteudo = Read(caminho);

        return conteudo;
    }

}
