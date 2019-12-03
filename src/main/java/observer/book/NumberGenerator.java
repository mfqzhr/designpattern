package observer.book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();

    public abstract void execute();
}
