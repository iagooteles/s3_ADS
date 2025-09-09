public class Quadrado implements FormaGeometrica {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int calculaArea() {
        return lado * lado;
    }

}
