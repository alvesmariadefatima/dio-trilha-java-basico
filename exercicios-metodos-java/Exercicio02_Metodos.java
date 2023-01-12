public class Exercicio02_Metodos{
    public static void main(String[] args) {
        public static void areaQuadrado(double lado1, double lado2){
            double resultadoAreaQuadrado = lado1*lado2;
            System.out.println("Área do Quadrado: " + resultadoAreaQuadrado);
        }
        public static void areaRetangulo(double base, double altura){
            double resultadoAreaRetangulo = base*altura;
            System.out.println("Área do Retângulo: " + resultadoAreaRetangulo);
        }
        public static void areaTrapzeio(double baseMaior, double baseMenor, double altura){
            double resultadoAreaTrapezio = (baseMaior+baseMenor)*altura/2;
            System.out.println("Área do Trapézio: " + resultadoAreaTrapezio);
        }
    }
}