public class LembraSenha {
    private Connection connection;

    public LembraSenha(Connection con) {
        this.connection = con;
    }

    public void connect() {
        connection.connect();
    }
}
