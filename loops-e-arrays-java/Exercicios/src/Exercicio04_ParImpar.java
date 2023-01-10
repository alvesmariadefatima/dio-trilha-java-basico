import java.util.Scanner;

public class Exercicio04_ParImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;

        System.out.println("Quantidade de números: ");

        quantNumeros = scan.nextInt();

        int count = 0;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}