/**
 * Desafio3: Calcula o valor da variavel SOMA com base no algoritmo fornecido.
 * Autor: JoseV
 */

public class Desafio3 {

    public static void calcularSoma() {
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("O valor da variavel SOMA e: " + SOMA);
    }
}
