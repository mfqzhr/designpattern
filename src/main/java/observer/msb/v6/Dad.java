package observer.msb.v6;


/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public class Dad implements Observer {
    private void feed() {
        System.out.println("Dad feed....");
    }



    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }
}
