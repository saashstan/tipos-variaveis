public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // estudar:
        // tipos primitivos
        // classe String que representa texto na aplicação
        
        double salarioMinimo =2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.println(numero);
        final double ValorPi = 3.14; 
        // garante que a variavel não podera ser modificada
    }
}