/**
 * Desafio1: Verifica se um numero pertence a sequencia de Fibonacci.
 * Autor: JoseV
 */

import java.util.Scanner;

public class Desafio1 {

    public static void verificarFibonacci(int numero) {
        int a = 0, b = 1, c;
        if (numero == a || numero == b) {
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
            return;
        }
        c = a + b;
        while (c <= numero) {
            if (c == numero) {
                System.out.println(numero + " pertence a sequencia de Fibonacci.");
                return;
            }
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(numero + " nao pertence a sequencia de Fibonacci.");
    }
}
