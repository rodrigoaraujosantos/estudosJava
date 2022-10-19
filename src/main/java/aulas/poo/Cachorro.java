package aulas.poo;

public class Cachorro extends Pet {
    private String comidaFavorita;
    private  String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca){
        super(nome, idade, peso);
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }
    @Override //sobrescreve o metodo e preserva o original
    public void fazerSom(){
        System.out.println("Au au auuuu");
    }
    @Override
    public void brincar(){
        this.fazerSom();
        super.brincar();//chama a ação original
        this.dormir();
    }
    @Override
    public void comer(String comida){
        if(comida.equals(this.comidaFavorita)){
            super.comer(comida);
            //this.peso += 0.2; só funciona com protevted
            this.setPeso(this.getPeso() + 0.2);
        } else {
            System.out.println("Quero " + comida + " não!");
        }
    }

    public void correrAtrasMoto(){
        this.fazerSom();
        System.out.println("Correndo atrás da moto");
    }

    public static void main(String[] args){
        //testar a herança
        Pet pet1 = new Pet("bob",2, 7.100);
        pet1.dormir();
        pet1.comer("feijao");
        pet1.fazerSom();


        System.out.println("=================");


        Cachorro batata = new Cachorro("rex", 4, 10, "osso", "caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("arroz");
        batata.setPeso(20);
        batata.brincar();
        batata.correrAtrasMoto();
    }


}
