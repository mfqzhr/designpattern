package observer.v5;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }


    public boolean isCry() {
        return cry;
    }
    public void wakeUp() {
        cry = true;
        observers.forEach(observer -> observer.actionOnWakeUp() );

    }
}
