import java.util.Scanner;

public class Exercicio06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial +"! = ");
        for(int i = fatorial; i >= 1; i--){
            System.out.println("Fatorial de " + fatorial);

            multiplicacao = multiplicacao * i;

            System.out.println(multiplicacao);
        }
    }
}
