package observer.msb.v7;

/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public class WakeUpEvent {
    long timestamp;
    String loc;
    Child source;

    public WakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }
}
