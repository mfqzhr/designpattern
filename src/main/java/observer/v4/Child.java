package observer.v4;


/**
 * 加入多个观察者
 *
 * @author 穆繁强
 * @date 2019/12/2
 */
public class Child {
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mum mum = new Mum();
    private Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        dad.feed();
        dog.wang();
        mum.hug();

    }
}
