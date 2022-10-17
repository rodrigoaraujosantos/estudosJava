package aulas.poo;

//Testar o uso da classe Pessoa

public class PessoaTeste {
    public static void main(String[] args){
        //New gera um novo objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Rodrigo";
        pessoa1.sobrenome = "Araujo";
        pessoa1.altura = 1.71;
        pessoa1.peso = 81.0;
        pessoa1.idade = 39;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();

        Pessoa pessoa4 = new Pessoa("José", "Algusto", 60, 1.70, 60 );
        System.out.println(pessoa4.altura);
        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa = pessoa4.calculaImc();
        System.out.println(imcPessoa);
        pessoa4.comer("sushi");
        System.out.println(pessoa4.peso);
    }
}
