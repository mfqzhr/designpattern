package observer.book2;


/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public interface Observer {
    /**
     * 观察数字的变化,做出更新
     * @param generator
     */
    public abstract void update(NumGenerator generator);
}
