package aulas.poo;

public class Calculadora {
    public static double PI = 3.14;
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1, 3);
        double resultadoSub = Calculadora.subtracao(1, 3);
        double resultadoMult = Calculadora.multiplicacao(1, 3);
        double resultadoDiv = Calculadora.divisao(1, 3);
        System.out.println(Calculadora.PI);
        System.out.println(Math.pow(2, 3));
    }
}
