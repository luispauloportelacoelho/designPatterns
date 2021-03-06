package compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iteratorQuacker = quackers.iterator();
        while (iteratorQuacker.hasNext()) {
            Quackable quacker = (Quackable)iteratorQuacker.next();
            quacker.quack();
        }

    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
