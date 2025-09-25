public class ConexaoMySQL implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco MySQL...");
    }

    @Override
    public String getConnection() {
        return "Conexão MySQL";
    }
}
