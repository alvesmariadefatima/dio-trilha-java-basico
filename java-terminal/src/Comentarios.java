public class Comentarios {
    public static void main(String[] args) {
        // Esta linha contém um comentário

        /* Olá, 
         * Eu sou um conjunto 
         * de linhas com vários
         * comentários em um
         * bloco de comandos.
        */
    }

        /**
        * Estas duas estrelinhas
        * servem para identificar
        * que você pretende elaborar 
        * um comentário a nível de 
        * documentação.
        */
        
        /*
         * Este método foi elaborado as pressas
         * por isso eu abreviei o nome das variáveis
         * mas olha, ele tem a finalidade somar ou multiplcar
         * dois números 
        */
        public int somaMultiplica(int n, int x, String m) {
            int r = 0; // r é igual ao resultado
            if(m == "M"){
                r = n * x;
            } else {
                r = n + x;
            }
                return r;

        }

    public void metodo(){

    }
}
