public class App {
    public static void main(String[] args) throws Exception {
        Pagamento c1 = new Contrato(1500.0);
        Pagamento c2 = new Bolsista(900.0);
        Pagamento c3 = new Contrato(2500.0);
        Pagamento c4 = new Bolsista(1000.0);

        Folha f1 = new Folha();
        f1.add(c1);
        f1.add(c2);
        f1.add(c4);

        f1.calcular();
        System.out.println("Saldo da folha: " + f1.getSaldo());
    }
}
