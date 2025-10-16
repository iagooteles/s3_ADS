public class Main {
    public static void main(String[] args) {
        Temperatura t = new Temperatura(30);

        TermometroC celso = new TermometroC();
        TermometroF farinha = new TermometroF();

        
        t.addObserver(celso);
        t.addObserver(farinha);

        t.setTemp(20);
        t.setTemp(40);
        t.setTemp(50);
        t.setTemp(120);
        t.setTemp(100);
    }
}
