public class Operadores {
    public static void main(String[] args){
        /* String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1+1+1);

        System.out.println(concatenacao);
    
        int numero = 5;

        numero = - numero; //decrementaçao
        numero = + numero * - 1; // incrementação

        System.out.println(- numero);

        System.out.println(numero);

        repeticao (iteração) entre números atribuídos a uma incremento ou decremento
        int numero = 10;

        numero++;

        System.out.println(numero --);
        System.out.println(numero);
        
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 4;
        b = 4;

        //exemplo de operador ternário
        
        String resultado = a==b ? "verdadeiro" : "falso";
        
        System.out.println(resultado);

        //comparação entre dois valores

        String nomeUm = "Maria";
        String nomeDois = new String ("Maria");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        //condição booleana caso os dois valores forem iguais

        boolean simNao = numero1==numero2;

        if(numero1 == numero2){ //true
            System.out.println("A nossa condição é válida.");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //condição booleana caso os dois valores forem diferentes
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
    
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
        */

        //exemplo de operadores lógicos AND, OR e NOT
        boolean condicao1 = true;

        boolean condicao2 = true;
        
        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras.");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }
            System.out.println("Fim.");
    }
}
