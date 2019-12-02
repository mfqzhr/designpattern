package observer.v6;

/**
 * 事件类 fire event
 * @author 穆繁强
 * @date 2019/12/2
 */
public class WakeUpEvent {
    long timestamp;
    String loc;

    public WakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }

}
