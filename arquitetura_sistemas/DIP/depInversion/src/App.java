public class App {
    public static void main(String[] args) throws Exception {
        MyOracleConnection oracleDB = new MyOracleConnection();
        MySQLConnection sqlDB = new MySQLConnection();

        LembraSenha lembraSenha = new LembraSenha(oracleDB);
        lembraSenha.connect();
    }
}
