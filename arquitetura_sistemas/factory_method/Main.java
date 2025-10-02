public class Main {
    public static void main(String[] args) {
        Channel channelTCP = TCPChannelFactory.create();
        channelTCP.getMessage();
        
        Channel channelUDP = UDPChannelFactory.create();
        channelUDP.getMessage();
    }    
}
