package aulas.poo;

public class Pet {
    private String nome;
    private int idade;
    private double peso;

    public Pet(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom(){
        System.out.println("...");
    }

    public void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }

    public void dormir(){
        System.out.println("ZZZZZZ");
    }

    public void brincar(){
        System.out.println("Estou brincando...");
    }

    public double getPeso(){ // apenas leitura
        return this.peso;
    }

    public void setPeso(double novoPeso){ // possivel alterar valor
        this.peso = novoPeso;
    }

    public String getNome(){ // apenas leitura
        return this.nome;
    }

    public void setNome(String novoNome){ // possivel alterar valor
        this.nome = novoNome;
    }

    public int getIdade(){ // apenas leitura
        return this.idade;
    }

    public void setIdade(int novoIdade){ // possivel alterar valor
        this.idade = novoIdade;
    }
}
