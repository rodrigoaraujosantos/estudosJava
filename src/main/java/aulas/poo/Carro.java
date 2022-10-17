package aulas.poo;

public class Carro {

    String modelo;
    String marca;
    int ano;
    boolean ehFlex;
    int qtPortas;
    double combustivelAtual;

    double consumo;
    boolean estaLigado;

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtPortas = qtPortas;
        this.combustivelAtual = 30.0;
        this.consumo = consumo;
        this.estaLigado = false;
    }

    //abastecer
    void abastecer(double litros) {
        this.combustivelAtual += litros;
    }
    //ligar
    void ligar(){
        this.estaLigado = true;
    }
    //desligar
    void Desligar(){
        this.estaLigado = false;
    }

    //viajar
    boolean viajar(String local, double distancia){
        if(!this.estaLigado){
            this.ligar();
        }
        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0){
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem p/ "+local+ " aconteceu, sobrou "+this.combustivelAtual+" L");
            return true;
        } else {
            System.out.println("A viagem não foi possível.");
            return false;
        }


    }
    public static void main(String[] args){
        Carro car1 = new Carro("118","bmw", 2020, true, 4, 10);
        Carro car2 = new Carro("a1","audi", 2019, false, 4, 14);

        System.out.println(car1.marca);
        car1.marca = "vw";
        System.out.println(car1.marca);

        boolean viajou = car1.viajar("sp", 2000);
        System.out.println(viajou);
    }


}
