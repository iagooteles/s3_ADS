public class App {
    public static void main(String[] args) throws Exception {
        Remuneravel c1 = new Contrato(5000f);
        Remuneravel e1 = new Estagio(1200f);

        Folha folha = new Folha();

        folha.calcular(c1);
        System.out.println("Saldo (Contrato): R$ " + folha.getSaldo());

        folha.calcular(e1);
        System.out.println("Saldo (Estágio): R$ " + folha.getSaldo());
    }
}
