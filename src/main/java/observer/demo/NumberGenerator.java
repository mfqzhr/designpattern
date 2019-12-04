package observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 穆繁强
 * @date 2019/12/4
 * @description 用于生成数字,观察对象
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public NumberGenerator addObserver(Observer observer) {
        observers.add(observer);
        return this;
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();

    public abstract String getGeneratorName();

    public abstract void execute();

}
