package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
    
        //Calculadora Básica
        
        Locale.setDefault(Locale.US);
        Scanner usuario = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        String nome;

       System.out.println("Insira seu nome: ");
       nome = usuario.nextLine();

       System.out.println("Olá " + nome + " qual operação vamos realizar hoje: " + System.lineSeparator()
         + "1- Soma" + System.lineSeparator()
         + "2- Subtração" + System.lineSeparator()
         + "3- Multiplicação" + System.lineSeparator()
         + "4- Divisao" + System.lineSeparator()
         + "5- fechar"
        );

        int opcao = numero.nextInt();
        int numero1;
        int numero2;
        int resultado;

        switch (opcao) {
            case 1:
                System.out.println("Insira o primeiro numero: ");
                numero1 = numero.nextInt();
                System.out.println("Insira o segundo numero: ");
                numero2 = numero.nextInt();

                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;

            case 2:
                System.out.println("Insira o primeiro numero: ");
                numero1 = numero.nextInt();
                System.out.println("Insira o segundo numero: ");
                numero2 = numero.nextInt();

                resultado = numero1 - numero2;
                System.out.println(resultado);
                break;
            case 3:
                System.out.println("Insira o primeiro numero: ");
                numero1 = numero.nextInt();
                System.out.println("Insira o segundo numero: ");
                numero2 = numero.nextInt();

                resultado = numero1 * numero2;
                System.out.println(resultado);
                break;

            case 4:
                System.out.println("Insira o primeiro numero: ");
                numero1 = numero.nextInt();
                System.out.println("Insira o segundo numero: ");
                numero2 = numero.nextInt();

                resultado = numero1 / numero2;
                System.out.println(resultado);
                break;

            case 5:
                System.out.println("Obrigado " + nome + "por usa o nosso sistema!");
                break;

            default:
                System.out.print("Opção invalida");
                break;
        }
    }
}
