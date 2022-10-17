package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Vetores {
    public static void main(String[] args){
        int[] v1 = new int[10];
        Random gerador1 = new Random();
        for (int i = 0; i < v1.length; i++){
            v1[i] = gerador1.nextInt(10);
        }

        int[] v2 = new int[10];
        Random gerador2 = new Random();
        for (int i = 0; i < v2.length; i++){
            v2[i] = gerador2.nextInt(10);
        }
        int contador = 0;
        for (int i = 0; i < 10; i++){
            if(v1[i] == v2[i]){
                contador = contador + 1;
            }
        }
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        System.out.println("Os números se repetem nas mesmas posições "+contador+" vez(es)!");

    }
}
