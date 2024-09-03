import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== Menu de Questoes =====");
            System.out.println("1. Verificar se um numero pertence a sequencia de Fibonacci");
            System.out.println("2. Verificar a existencia da letra 'a' em uma string");
            System.out.println("3. Calcular o valor da variavel SOMA");
            System.out.println("4. Completar o proximo elemento das sequencias");
            System.out.println("5. Desafio dos Interruptores e Lampadas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            // Verifica se a entrada é um número válido
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um numero valido.");
                scanner.next(); // Limpa a entrada inválida
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite um numero para verificar se pertence a sequencia de Fibonacci: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    Desafio1.verificarFibonacci(numero);
                    break;
                case 2:
                    System.out.print("Digite uma string para verificar a ocorrencia da letra 'a': ");
                    String input = scanner.nextLine();
                    Desafio2.verificarLetraA(input);
                    break;
                case 3:
                    Desafio3.calcularSoma();
                    break;
                case 4:
                    Desafio4.completarSequencia();
                    break;
                case 5:
                    Desafio5.resolverDesafio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
