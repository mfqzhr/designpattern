package observer.book2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public abstract class NumGenerator {
    List<Observer> list = new ArrayList<>();

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        list.remove(observer);
    }


    public void notifyObservers() {
        list.forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();
    public abstract void execute();
}
