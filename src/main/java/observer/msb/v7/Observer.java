package observer.msb.v7;

/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public interface Observer {
    /**
     * 要观察的事件
     * @param wakeUpEvent
     */
    void actionOnWakeUpEvent(WakeUpEvent wakeUpEvent);
}
