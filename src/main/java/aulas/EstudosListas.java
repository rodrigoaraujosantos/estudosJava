package aulas;

import java.util.ArrayList;

public class EstudosListas {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println(numeros);
        numeros.add(10);
        numeros.add(20);
        numeros.add(1000);
        System.out.println(numeros);

        System.out.println(numeros.get(2));

        numeros.set(0, 23);
        System.out.println(numeros);

        numeros.remove(0);

        System.out.println(numeros);

        numeros.add(0, 23);

        System.out.println(numeros.size()); // tamanho da lista
        System.out.println("=====================");
        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));

        }
        System.out.println("=====================");
        for(int numero : numeros){
            System.out.println(numero);
        }

        System.out.println(numeros.contains(2000));

        System.out.println(numeros.indexOf(23));

    }
}
