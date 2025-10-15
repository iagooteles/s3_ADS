public class BufferChannel extends ChannelDecorator {
    public BufferChannel(Channel channel) {
        super(channel);
    }

    public void bufferChannel(Channel channel) {
        System.out.println("Usando buffer no canal...");
    }

    @Override
    public void send(String message) {
        bufferChannel(decoratedChannel);
        System.out.println("Armazenando mensagem no buffer antes de enviar...");
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("Lendo mensagem do buffer...");
        return super.receive();
    }

}
