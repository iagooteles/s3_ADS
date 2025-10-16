public class TermometroC implements Observer {
    public void update(Subject sub) {
        double temp = ((Temperatura) sub).getTemp();
        System.out.println("A temperatura atual é: " + temp + "ºC");
    }
}
