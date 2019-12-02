package observer.v7;


/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public class Mum implements Observer {
    private void hug() {
        System.out.println("mum hugging");
    }


    @Override
    public void actionOnWakeUpEvent(WakeUpEvent wakeUpEvent) {
        hug();
    }
}
