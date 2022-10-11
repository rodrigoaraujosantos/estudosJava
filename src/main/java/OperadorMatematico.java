import java.util.Scanner;

public class OperadorMatematico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma das operações: (1-Adição 2-Subtração 3-Multiplicação 4-Divisão");
        int escolha = entrada.nextInt();

        System.out.println("Informe o primeiro número:");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o segundo número:");
        double num2 = entrada.nextDouble();

        switch (escolha) {
            case 1:
                double soma = num1 + num2;
                System.out.println("O resultado é: " + soma);
                break;
            case 2:
                double subtracao = num1 - num2;
                System.out.println("O resultado é: " + subtracao);
                break;
            case 3:
                double multiplicacao = num1 * num2;
                System.out.println("O resultado é: " + multiplicacao);
                break;
            case 4:
                double divisao = num1 / num2;
                System.out.println("O resultado é: " + divisao);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
