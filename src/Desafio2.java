/**
 * Desafio2: Verifica a existencia da letra 'a' em uma string e conta a quantidade de vezes que aparece.
 * Autor: JoseV
 */

import java.util.Scanner;

public class Desafio2 {

    public static void verificarLetraA(String texto) {
        int count = contarLetraA(texto);
        System.out.println("A letra 'a' (ou 'A') aparece " + count + " vezes na string.");
    }

    private static int contarLetraA(String texto) {
        int count = 0;
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
