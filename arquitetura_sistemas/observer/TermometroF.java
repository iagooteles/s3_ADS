public class TermometroF implements Observer {
    public void update(Subject sub) {
        double temp = ((Temperatura) sub).getTemp();
        temp = temp + 32;
        System.out.println("A temperatura atual é: " + temp + "ºF");
    }
}
