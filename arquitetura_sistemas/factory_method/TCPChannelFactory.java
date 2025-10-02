public class TCPChannelFactory extends ChannelFactory {
    
    public static Channel create() {
        return new TCPChannel();
    }
}