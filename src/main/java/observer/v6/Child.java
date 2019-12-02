package observer.v6;


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
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed");
        observers.forEach(observer -> observer.actionOnWakeUp(event) );
    }
}
