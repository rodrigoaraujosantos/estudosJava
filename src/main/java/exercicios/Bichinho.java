//2)
//
//        Crie uma classe Bichinho:
//        * Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
//        * Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
//        * Métodos:
//        - co
//        * Métodos:
//        - comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
//        - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
//        - acordar() => altera o boolean estaDormindo p/ false
//
//

package exercicios;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bichinho{
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho = new ArrayList<Comida>();
    private boolean estaDormindo;
    private LocalDateTime horaDataCriacao;

    public Bichinho(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;

        this.setEstaDormindo(false);
        this.horaDataCriacao = LocalDateTime.now();
    }


     public Comida getUltimaComida(){
        if(this.bucho.size() > 0){
            return this.bucho.get(this.bucho.size() - 1);
        } else {
            return null;
        }
     }
//        - comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
//        - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
//        - acordar() => altera o boolean estaDormindo p/ false


    public void comer(Comida comida){
        if(!this.isEstaDormindo()){
            if(this.getUltimaComida() == null || this.getUltimaComida() != comida){
                this.peso += comida.getPeso();
            } else {
                System.out.println("Ja comi este prato, traga algo diferente!");
            }
        } else {
            System.out.println("Bichinho dormindo!");
        }

    }

    public void dormir(int horas){
        this.isEstaDormindo() == false
    }


    public boolean isEstaDormindo() {
        return estaDormindo;
    }

    public void setEstaDormindo(boolean estaDormindo) {
        this.estaDormindo = estaDormindo;
    }
}
