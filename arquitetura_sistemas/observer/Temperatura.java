
public class Temperatura extends Subject {
    private double temp;
    
    public Temperatura(double temp) {
        super();
        this.temp = temp;
    }

    public double getTemp() {
        return this.temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        notifyObserver();
    }
}
