public class Bolsista implements Pagamento {

    private double bolsa;

    public Bolsista(double bolsa) {
        this.bolsa = bolsa;
    }

    public double getSaldo() {
        return this.bolsa;
    }

}
