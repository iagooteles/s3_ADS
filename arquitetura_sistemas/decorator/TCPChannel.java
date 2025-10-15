public class TCPChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Enviando via TCP: " + message);
    }

    @Override
    public String receive() {
        return "Recebido via TCP";
    }
}
