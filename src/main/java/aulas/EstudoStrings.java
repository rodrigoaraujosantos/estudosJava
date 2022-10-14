package aulas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args){
        String nome = "Pedro";

        if(nome == "Pedro") {
            System.out.println("São iguais");
        }

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu sobrenome");
        String sobrenome = entrada.nextLine();

        if (sobrenome.equals("pereira")){ // comparação de conteúdos
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        String java = "Java";

        String ja = java.substring(1); // retorna apenas as letras passando oinicio e o fim (0, 2)
        System.out.println(ja);

        String m1 = "Hello, ";
        String m2 = "World!";
        String m3 = m1.concat(m2);

        System.out.println(m3);
        System.out.println(java.length());
        System.out.println(java.isEmpty());
        System.out.println(java.toUpperCase());
        System.out.println(java.toLowerCase());

        System.out.println("Digite seu nome:");
        String seuNome = entrada.nextLine();

        if(seuNome.toUpperCase().equals("JOSÉ")){
            System.out.println("SEU NOME É JOSÉ");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/");
        System.out.println(valores[0]);

        String email = "araujo.1983@hotmail.com";
        String[] valoresEmail = email.split("@");
        System.out.println(valoresEmail[0]);

        String nome2 = "Rodrigo Araujo";
        String[] nomeSeparado = nome2.split(" ");
        System.out.println(nomeSeparado[1]);
        System.out.println(Arrays.toString(nomeSeparado));

    }
}
