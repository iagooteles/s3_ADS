public class ProjetorSamsungAdapter implements Projetor {
    private ProjetorSamsung projetorSamsung;

    public ProjetorSamsungAdapter (ProjetorSamsung projetorSamsung) {
        this.projetorSamsung = projetorSamsung;
    }

    @Override
    public void liga() {
        projetorSamsung.turnOn();
    }
}
