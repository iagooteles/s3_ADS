public class LogChannel extends ChannelDecorator {

    public LogChannel(Channel channel) {
        super(channel);
    }

    public void logChannel(Channel channel) {
        System.out.println("Registrando logs do canal...");
    }

    @Override
    public void send(String message) {
        logChannel(decoratedChannel);
        System.out.println("LOG: Enviando mensagem: " + message);
        super.send(message);
    }

    @Override
    public String receive() {
        String data = super.receive();
        System.out.println("LOG: Mensagem recebida: " + data);
        return data;
    }

}
