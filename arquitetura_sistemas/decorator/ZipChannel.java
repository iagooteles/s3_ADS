public class ZipChannel extends ChannelDecorator {
    public ZipChannel(Channel channel) {
        super(channel);
    }

    public void zipChannel(Channel channel) {
        System.out.println("Comprimindo dados do canal...");        
    }

    @Override
    public void send(String message) {
        zipChannel(this.decoratedChannel);
        System.out.println("Compactando antes de enviar...");
        super.send("[ZIP]" + message);
    }

    @Override
    public String receive() {
        String data = super.receive();
        System.out.println("Descompactando dados recebidos...");
        return data.replace("[ZIP]", "");
    }
}
