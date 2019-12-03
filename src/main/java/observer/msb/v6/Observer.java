package observer.msb.v6;

/**
 * @author 穆繁强
 * @date 2019/12/2
 */
public interface Observer {
    /**
     * 小孩醒了之后所有的状况封装到事件里面
     * @param wakeUpEvent
     */
    void actionOnWakeUp(WakeUpEvent wakeUpEvent);
}
