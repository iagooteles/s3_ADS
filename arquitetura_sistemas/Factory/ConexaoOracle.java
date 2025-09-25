public class ConexaoOracle implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco Oracle...");
    }

    @Override
    public String getConnection() {
        return "Conexão Oracle";
    }
}
