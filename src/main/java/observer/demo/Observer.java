package observer.demo;

/**
 * @author 穆繁强
 * @date 2019/12/4
 * @description 观察者,负责接收状态变化通知
 */
public interface Observer {
    public abstract void update(NumberGenerator generator);
}
