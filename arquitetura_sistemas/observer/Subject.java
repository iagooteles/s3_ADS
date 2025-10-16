import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
    private List<Observer> lista; 

    public Subject() {
        lista = new ArrayList<Observer>() {
            
        };
    }

    public void addObserver(Observer obs) {
        lista.add(obs);
    }

    public void removeObserver(Observer obs) {
        lista.remove(obs);
    }

    public void notifyObserver() {
        Iterator<Observer> itmalia = lista.iterator();

        while (itmalia.hasNext()) {
            Observer ob = itmalia.next();
            ob.update(this);
        }
    }
}
