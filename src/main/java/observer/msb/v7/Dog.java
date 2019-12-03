package observer.msb.v7;


/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public class Dog implements Observer {
    private void wang() {
        System.out.println("dog wang......");
    }


    @Override
    public void actionOnWakeUpEvent(WakeUpEvent wakeUpEvent) {
        wang();
    }
}
