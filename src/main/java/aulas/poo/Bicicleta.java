package aulas.poo;

public class Bicicleta extends Object {
    private int marcha;
    private int velocidade;

    Bicicleta(int marcha, int velocidade){
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    @Override
    public String toString(){
        return "Bicicleta " + this.marcha + " " + this.velocidade;
    }

    public static void main(String[] args){
        Bicicleta bicicleta = new Bicicleta(21, 0);
        System.out.println(bicicleta);
    }
}
