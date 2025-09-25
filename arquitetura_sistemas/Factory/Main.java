public class Main {
    public static void main(String[] args) {
        Connection conexao1 = ConexaoFactory.criarConexao("oracle");
        Connection conexao2 = ConexaoFactory.criarConexao("postgresql");
        Connection conexao3 = ConexaoFactory.criarConexao("mysql");

        conexao1.connect();
        System.out.println("Criada: " + conexao1.getConnection());

        conexao2.connect();
        System.out.println("Criada: " + conexao2.getConnection());

        conexao3.connect();
        System.out.println("Criada: " + conexao3.getConnection());
    }
}
