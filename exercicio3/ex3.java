package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner number = new Scanner(System.in);

        int numero;

        System.out.println("Informe um numero: ");
        numero = number.nextInt();

        if (numero % 2 == 0 ) {
            System.out.println("O numero é PAR");
        } else {
            System.out.println("Este número é IMPAR");
        }
    }
}
