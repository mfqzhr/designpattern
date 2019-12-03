package observer.msb.v3;

/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public class Child {
    private boolean cry = false;
    private Dad d = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        d.feed();
    }
}