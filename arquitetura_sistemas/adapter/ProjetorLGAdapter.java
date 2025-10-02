public class ProjetorLGAdapter implements Projetor {

    private ProjetorLG projetorLG;
    private int time = 3;

    public ProjetorLGAdapter(ProjetorLG projetorLG) {
        this.projetorLG = projetorLG;
    }

    @Override
    public void liga() {
        projetorLG.enabled(this.time);
    }
}
