package observer.demo;

import org.junit.Test;

/**
 * @author 穆繁强
 * @date 2019/12/4
 */
public class MainTest {
    /**
     * 测试随机数计数器,只有数字观察者
     */
    @Test
    public void test1() {
        new RandomNumberGenerator()
                .addObserver(new DigitalObserver())
                .execute();
    }

    /**
     * 测试随机数计数器,只有图形观察者
     */
    @Test
    public void test2() {
        new RandomNumberGenerator()
                .addObserver(new GraphObserver())
                .execute();

    }

    /**
     * 测试随机数计数器,同时有图形观察者和数字观察者
     */
    @Test
    public void test3() {
        new RandomNumberGenerator()
                .addObserver(new GraphObserver())
                .addObserver(new DigitalObserver())
                .execute();

    }

    /**
     * 测试偶数计数器,同时有图形观察者和数字观察者
     */
    @Test
    public void test4() {
        new EvenNumberGenerator()
                .addObserver(new GraphObserver())
                .addObserver(new DigitalObserver())
                .execute();

    }

    /**
     * 测试奇数计数器,同时有图形观察者和数字观察者
     */
    @Test
    public void test5() {
        new OddNumberGenerator()
                .addObserver(new GraphObserver())
                .addObserver(new DigitalObserver())
                .execute();
    }

    @Test
    public void test6() {


    }

    @Test
    public void test7() {


    }
}
