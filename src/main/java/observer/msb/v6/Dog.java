package observer.msb.v6;


/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public class Dog implements Observer {
    private void wang() {
        System.out.println("dog wang......");
    }


    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        wang();
    }
}
