import java.util.Scanner;

public class Exercicio05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        System.out.println("Tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + 1 +" = " + (tabuada*i));
        }
    }    
}
