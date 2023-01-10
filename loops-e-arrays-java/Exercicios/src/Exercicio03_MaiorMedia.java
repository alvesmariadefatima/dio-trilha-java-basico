import java.util.Scanner;

public class Exercicio03_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;

        do {
        System.out.println("Numero: ");
        numero = scan.nextInt();

        soma = soma + numero;
        
        if(numero > maior) maior = numero;

            count = count + 1;
            System.out.println("Maior: " + maior);
            System.out.println("Média: " + soma);
        } while(count < 5);
    }
}
