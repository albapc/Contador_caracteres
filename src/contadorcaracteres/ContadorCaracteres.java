package contadorcaracteres;

import javax.swing.JOptionPane;

/**
 *
 * @author Alba
 */
public class ContadorCaracteres {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        final String frase = JOptionPane.showInputDialog("Introduce una palabra o una frase");
        System.out.println(Metodos.contarLetras(frase));
    }

}
