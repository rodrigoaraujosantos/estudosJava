//2)
//
//
//
//        Crie uma classe Comida:
//        * Atributos: nome, peso;
//        * Construtores: Cria a comida com base nos parâmetros nome e peso;
//        * Métodos:
//        - getNome()
//        - getP

package exercicios;

public class Comida {
    private String nome;
    private double peso;

    Comida(String nome, double peso){
        this.nome = nome;
        this.peso = peso;

    }

    public String getNome(){
        return this.nome;
    }

    public double getPeso(){
        return this.peso;
    }
}
