import java.util.Scanner;

public class EstudosArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50];//posições de 0 a 49 para serem usadas
        numeros2[0] = 1;
        // ate
        numeros2[49] = 50;

        double[] notas = new double[5];
        String[] nomes = new String[10];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];

        // exemplo
        System.out.println("Digite o total de notas");
        int totalNotas = entrada.nextInt();
        double[] notasProva = new double[totalNotas];

        for(int i = 0; i < totalNotas; i++) {
            System.out.println("Digite o valor da "+(i+1)+"° nota:");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota : notasProva) {
            soma += nota;
        }

        double media = soma / totalNotas;

        String mensagem = (media < 7) ? "Voce esta reprovado" : "Voce esta aprovado";
        System.out.println(mensagem);

        //defaut values

    }
}
