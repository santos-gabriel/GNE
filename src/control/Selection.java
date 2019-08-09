package control;

import java.util.ArrayList;
import java.util.Random;

/**
 * @version V2.0
 * @author gabriel
 */
public class Selection extends Generation {

    /**
     * Classe filha destinada ao direcionamento do endereco dos arquivos
     * contendo os respectivos dados Classe possui metodos onde realiza de forma
     * randomica a selecao dos nomes e seus respectivos dados
     */
    private static final ArrayList<String> name = getRead("src/arq/nomesGNE.conf");
    private static final ArrayList<String> surname = getRead("src/arq/surnamesGNE.conf");
    private static final ArrayList<String> email = getRead("src/arq/emailsGNE.conf");
    private static int indice;
    private static Random rm = new Random();

    public static String getName() {

        indice = rm.nextInt(name.size());
        return name.get(indice);

    }

    public static String getSurname() {

        if (indice < surname.size()) {
            return surname.get(indice);
        } else {
            return surname.get(rm.nextInt(surname.size()));
        }

    }

    public static String getEmail() {

        return email.get(rm.nextInt(email.size()));

    }

    public static String removeAcento(String palavra) {

        palavra = palavra.replaceAll("á|à|ã|â", "a");
        palavra = palavra.replaceAll("Á|À|Â|Ã", "A");
        palavra = palavra.replaceAll("é|è|ê|ë", "e");
        palavra = palavra.replaceAll("É|È|Ê|Ë", "E");
        palavra = palavra.replaceAll("ó|ò|ô|ö", "o");
        palavra = palavra.replaceAll("Ó|Ò|Ô|Ö", "O");
        palavra = palavra.replaceAll("ú|ù|ü", "u");
        palavra = palavra.replaceAll("Ú|Ù|Ü", "U");
        palavra = palavra.replaceAll("í|ì", "i");
        palavra = palavra.replaceAll("Í|Ì", "I");

        return palavra;
    }
}
