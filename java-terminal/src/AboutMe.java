import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        //crindo o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome + "" + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}