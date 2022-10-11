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


        System.out.println("Olá, meu nome é " + nome + ", tenho " + altura + " de altura, e " + idade + " anos!");
        System.out.println(imc);
        System.out.printf("%.2f\n", imc);
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.00) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.00) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }

        // switch-case
        System.out.println("Selecione uma dieta ( 1 a 3 )");
        System.out.println("1 - Agua");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Voce escolheu a dieta da agua!");
                break; // impede de testar as condições abaixo
            case 2:
                System.out.println("Voce escolheu a diea da fruta!");
                break;
            case 3:
                System.out.println("Voce escolheu a dieta da batata!");
                break;
            default: // "else"
                System.out.println("Esta dieta não existe");
        }

        System.out.println("Voce tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for(int i = 0; i < totalAlimentos; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < totalAlimentos){
            System.out.println(i);
            i++;
        }

        System.out.println(i);
    }
}
