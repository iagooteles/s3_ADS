public class Folha {
    private float saldo;

    public void calcular(Remuneravel f) {
        this.saldo = f.getRemuneracao();
    }

    public float getSaldo() {
        return saldo;
    }
}