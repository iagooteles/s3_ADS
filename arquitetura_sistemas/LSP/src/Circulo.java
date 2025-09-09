public class Circulo implements FormaGeometrica {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int calculaArea() {
        return (int) (Math.PI * raio * raio);
    }
}
