package observer.demo;

/**
 * @author 穆繁强
 * @date 2019/12/4
 */
public class Main {
    public static void main(String[] args) {
        //奇数计数器
        //NumberGenerator generator = new OddNumberGenerator();

        //偶数计数器
        //NumberGenerator generator = new EvenNumberGenerator();

        //随机数计数器
        NumberGenerator generator = new RandomNumberGenerator();
        //只添加图形观察者
        //generator.addObserver(new GraphObserver()).execute();

        //只添加数字观察者
        //generator.addObserver(new DigitalObserver()).execute();

        //同时添加多个观察者
        generator.addObserver(new GraphObserver()).addObserver(new DigitalObserver()).execute();
    }
}
