public class Main {
    public static void main(String[] args) {
        Channel tcp = new TCPChannel();

        Channel channel = new LogChannel(new BufferChannel(new ZipChannel(tcp)));

        channel.send("Hello word em japonês é arigatô, gracias e de nada.");
        System.out.println(channel.receive());
    }
}
