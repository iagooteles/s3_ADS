public class Contrato implements Pagamento {

    private double salario;

    public Contrato(double salario) {
        this.salario = salario;
    }

    public double getSaldo() {
        return this.salario;
    }
}
