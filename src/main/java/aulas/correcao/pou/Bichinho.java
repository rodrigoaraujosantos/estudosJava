package aulas.correcao.pou;

import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho;
    private boolean estaDormindo;

    public Bichinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho = new ArrayList<>(); // buchin vazio
        this.estaDormindo = false; // acordado
    }

    public void comer(Comida comida) {
        if (this.estaDormindo) {
            System.out.println("zzzZZZZZZ");
        } else { // está acorda
            if (this.bucho.contains(comida)) { // ele já comeu?
                System.out.println("Já comi " + comida.getNome() + " !");
            } else { // a comida é nova
                this.bucho.add(comida);
                this.peso += comida.getPeso();
            }
        }
    }

    public void dormir(int horas) {
        this.estaDormindo = true;
        double porcentagemPeso = this.peso * 0.1;
        double quilosPerdidos = horas * porcentagemPeso;
        this.peso -= quilosPerdidos;
    }

    public void acordar() {
        this.estaDormindo = false;
    }

    public static void main(String[] args) {
        Bichinho pou = new Bichinho("Pou", 5, 100);
        Comida batata = new Comida("Batata", 15.0);
        pou.comer(batata);
        pou.comer(batata);
        pou.dormir(2); // this.estaDormindo = true
        pou.comer(batata);

        pou.acordar();
        Comida frango = new Comida("Frango", 30.0);
        pou.comer(frango);
        pou.comer(frango);
    }
}
