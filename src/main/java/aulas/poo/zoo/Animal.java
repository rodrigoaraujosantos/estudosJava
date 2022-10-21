package aulas.poo.zoo;

import javax.sound.midi.Soundbank;

public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);

}

class Gato implements Animal {
    @Override
    public void dormir(){
        System.out.println("zzzz miua");
    }

    @Override
    public void fazerSom(){
        System.out.println("miau");
    }

    @Override
    public void comer(String comida){
        if(comida.equals("peixe")){
            System.out.println("Hummm gosto de peixe");
        } else {
            System.out.println("So como peixe");
        }
    }

}
class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("zzzzzzz co corico");
    }

    @Override
    public void fazerSom() {
        System.out.println("co corico");
    }

    @Override
    public void comer(String comida) {
        System.out.println("hummm gosto de " + comida);
    }

    public static void main(String[] args){
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("milho");

        gato.fazerSom();
        gato.dormir();
        gato.comer("peixe");

        Animal animalGalinha = galinha;
        Animal animalGatinho = gato;

        System.out.println("==POLIMORFISMO==");

        animalGalinha.fazerSom();
        animalGatinho.fazerSom();
    }
}




