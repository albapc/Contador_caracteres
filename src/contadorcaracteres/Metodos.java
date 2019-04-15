package contadorcaracteres;

/**
 *
 * @author Alba
 */
public class Metodos {

    /** Cuenta el número de letras de la frase que introduzcamos, excluyendo caracteres
     * que no sean letras y espacios
     *
     * @param frase
     * @return tamaño de soloLetras
     */
    public static int contarLetras(String frase) {
        final String soloLetras = frase.replaceAll("[^\\p{L}]", "");
        return soloLetras.length();
    }
}
