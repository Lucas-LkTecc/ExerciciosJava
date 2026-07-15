package exercicio4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        //Conversor de temperatura

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Escolha uma das opções: " + System.lineSeparator()
         + "1- Celcius" + System.lineSeparator()
         + "2- Fahrenheit" 
        );

        int opcao = scanner.nextInt();
        int temperatura;
        double resultado;

        switch (opcao) {
            case 1:
                System.out.println("Ensira a temperatura em C para converter para F: ");
                temperatura = scanner.nextInt();
                resultado = temperatura * 1.8 + 32; 
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                System.out.println("Ensira a temperatura em F para converter para C: ");
                temperatura = scanner.nextInt();
                resultado = (temperatura - 32) / 1.8;
                System.out.println("Resultado: " + resultado);
            default:
                break;
        }
        scanner.close(); //Boa pratica: sempre fechar o scanner

        /*
            Primeiro metodo que utilizei

            double temperatura;
        
            System.out.println("Insira a temperatura que deseja converter: ");
            temperatura = number.nextInt();

            double resultado = temperatura * 1.8 + 32;

            System.out.println(resultado);
        
        */
    }
}
