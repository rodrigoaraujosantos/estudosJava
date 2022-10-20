package aulas.poo.escola;

public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno("rodrigo", "araujo.1983@hotmail.com", "11111111111", 7.5);
        aluno.seApresentar();

        Professor prof = new Professor("artur", "prof@prof.com", "333333", "ti");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("maria", "maria@maria", "345543443");

        Pessoa p2 = new Aluno("rodrigo", "araujo.1983@hotmail.com", "11111111111", 7.5);

        Pessoa p3 = new Professor("artur", "prof@prof.com", "333333", "ti");

        System.out.println("========================");
        p1.seApresentar();
        System.out.println("========================");
        p2.seApresentar();
        System.out.println("========================");
        p3.seApresentar();
    }
}
