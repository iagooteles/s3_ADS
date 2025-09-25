public class DBConn {

    private static DBConn instancia;

    private DBConn() {}

    public static DBConn getInstance() {
        if (instancia == null) {
            instancia = new DBConn();
        }
        
        return instancia;
    }

    public void connecta() {
        System.out.println("Conecta com o banco de dados!");
    }
}
