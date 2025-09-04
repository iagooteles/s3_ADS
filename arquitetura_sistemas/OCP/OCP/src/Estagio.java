public class Estagio implements Remuneravel {
    private float bolsa;

    public Estagio(float bolsa) {
        this.bolsa = bolsa;
    }

    public float bolsa() {
        return bolsa;
    }

    @Override
    public float getRemuneracao() {
        return bolsa();
    }
}