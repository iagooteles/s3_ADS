public class Main {
    public static void main(String[] args) {
        
        DBConn conn1 = DBConn.getInstance();
        DBConn conn2 = DBConn.getInstance();

        conn1.connecta();
        conn2.connecta();
    }
}
