public class EstudoEnums {
    public static void main(String[] args){
        enum DiaDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev { JUNIOR, PLENO, SENIOR }
        NivelDev nivel = NivelDev.JUNIOR;

        switch (nivel){
            case JUNIOR:
                System.out.println("Seu nível é JR");
                break;
            case PLENO:
                System.out.println("Seu nível é PL");
                break;
            case SENIOR:
                System.out.println("Seu nível é SR");
                break;
        }

//        switch (nivel){
//            case JUNIOR -> {
//                System.out.println("Seu nível é JR");
//            }
//        } // não precisa do break


    }
}
