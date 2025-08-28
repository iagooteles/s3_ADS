import java.util.ArrayList;

public class Folha {
    
    protected double saldo;
    private ArrayList<Pagamento> funcionarios;

    public Folha() {
        this.saldo = 0;
        this.funcionarios = new ArrayList<>();
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void add(Pagamento pag) {
        this.funcionarios.add(pag);
    }

    public void calcular() {
        for (Pagamento p: funcionarios) {
            this.saldo += p.getSaldo();
        }
    }
}
