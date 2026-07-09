import java.util.Locale;
import java.util.Scanner;

class olaMundo {
    /* 
        OLÁ MUNDO CUSTOMIZADO: faça um código que receba o nome de uma pessoa e exiba uma mensagem personalizada
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner pessoa = new Scanner(System.in);
        
        System.out.println("Insira seu nome: ");
        String nome = pessoa.nextLine();


        System.out.println("Olá, " + nome);
    }
}