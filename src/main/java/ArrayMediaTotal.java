import java.util.Arrays;
import java.util.Scanner;

public class ArrayMediaTotal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do grupo de números: ");
        int tamanho = entrada.nextInt();
        int[] tamanhoNumeros = new int[tamanho];
        int[] arrValores = new int[50];
        for (int i = 1; i <= tamanhoNumeros.length; i++){
            System.out.println("Informe o "+i+"° número:");
            arrValores[i] = entrada.nextInt();

        }
        int soma = Arrays.stream(arrValores).sum();
        int media = soma / tamanho;
        System.out.println("O total dos valores informados são: "+soma+ " e a média é: "+media);

    }
}
