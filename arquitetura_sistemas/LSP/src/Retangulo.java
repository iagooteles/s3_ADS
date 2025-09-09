public class Retangulo implements FormaGeometrica {
    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calculaArea() {
        return base * altura;
    }
}
