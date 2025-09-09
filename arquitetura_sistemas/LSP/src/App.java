public class App {
    public static void main(String[] args) throws Exception {
        
        FormaGeometrica f1 = new Retangulo(5, 10);
        FormaGeometrica f2 = new Quadrado(6);

        System.out.println("Área do Retângulo: " + f1.calculaArea());
        System.out.println("Área do Quadrado: " + f2.calculaArea());
    }
}
