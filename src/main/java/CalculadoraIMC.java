import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual a sua altura? ");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu peso?");
        double peso = entrada.nextDouble();

        //Calculo do IMC = peso / altura ^ 2

        double imc = (altura * altura) / peso;


        System.out.println("Olá, meu nome é " + nome + ", tenho "+ altura + " de altura, e " + idade + " anos!");
        System.out.println(imc);
        System.out.printf("%.2f\n", imc);
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);
    }
}
