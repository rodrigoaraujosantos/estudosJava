import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args){
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);
        System.out.println(hoje.isAfter(natal));
        System.out.println(hoje.getYear());
        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

        System.out.println("Faltam "+diasParaNatal+" dias para o Natal!");
    }
}
