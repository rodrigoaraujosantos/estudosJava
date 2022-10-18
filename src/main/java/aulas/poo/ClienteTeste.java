package aulas.poo;

import java.time.LocalDate;

public class ClienteTeste {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente(1, "Felipe", "José", LocalDate.of(1993, 4, 5), 1.80, 105);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());

    }
}
