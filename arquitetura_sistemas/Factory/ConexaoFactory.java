public class ConexaoFactory {
    public static Connection criarConexao(String tipo) {
        if (tipo.equalsIgnoreCase("oracle")) {
            return new ConexaoOracle();
        } else if (tipo.equalsIgnoreCase("postgresql")) {
            return new ConexaoPostgres();
        } else if (tipo.equalsIgnoreCase("mysql")) {
            return new ConexaoMySQL();
        } else {
            throw new IllegalArgumentException("Tipo de conexão desconhecido: " + tipo);
        }
    }
}
