public class Clt implements Remuneravel {
    private float salarioBase;
    private float beneficios;

    public Clt(float salarioBase, float beneficios) {
        this.salarioBase = salarioBase;
        this.beneficios = beneficios;
    }

    public float salarioBase() {
        return salarioBase;
    }

    public float beneficios() {
        return beneficios;
    }

    @Override
    public float getRemuneracao() {
        return salarioBase + beneficios;
    }
}