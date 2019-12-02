package observer.v5;

/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public class Mum implements Observer {
    private void hug() {
        System.out.println("mum hugging");
    }

    @Override
    public void actionOnWakeUp() {
        hug();
    }
}
