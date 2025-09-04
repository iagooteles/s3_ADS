public class Contrato implements Remuneravel {
    private float salario;

    public Contrato(float salario) {
        this.salario = salario;
    }

    public float salario() {
        return salario;
    }

    @Override
    public float getRemuneracao() {
        return salario();
    }
}