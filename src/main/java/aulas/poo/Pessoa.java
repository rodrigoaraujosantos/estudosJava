package aulas.poo;

import java.util.ArrayList;

public class Pessoa {
    //Propriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    ArrayList<Pessoa> conhecidos = new ArrayList<>();

    Pessoa() { // Construtor da classe
        // this  -> representa o objeto
        this.nome = "Rodrigo";
        this.sobrenome = "Araujo";
        this.altura = 1.71;
        this.peso = 81.0;
        this.idade = 39;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //Ações de uma Pessoa (métodos)
    //<tipo_retorno> nomeDoMetod(PARAMETROS){}
    void dizOla(){ //método
        System.out.println("Olá, tudo bem? Meu nome é "+ this.nome);
    }

    void mostrarImc() {
        double imc = this.peso / (this.altura * this.altura);
        System.out.println("O IMC é " + imc);
    }

    double calculaImc() {
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer (String comida) {
        System.out.println("Estou comento "+ comida);
        this.peso += 1.5;
    }

    void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if(!this.conhecePessoa(pessoa)){
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this);// this é o objeto que chama cumprimentar
        }
    }

    void addPessoaNova(Pessoa pessoa){
        System.out.println(this.nome + " conheceu " + pessoa.nome + "!!!");
        this.conhecidos.add(pessoa);
    }

    boolean conhecePessoa(Pessoa pessoa) {
        //se true, a pessoa (this) conhece a outra
        //se false, não conhece
        return this.conhecidos.contains(pessoa);
    }
}
