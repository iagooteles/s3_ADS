public class ConexaoPostgres implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco Postgres...");
    }

    @Override
    public String getConnection() {
        return "Conexão Postgres";
    }
}
