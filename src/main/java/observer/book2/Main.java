package observer.book2;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class Main {
    public static void main(String[] args) {
        NumGenerator generator = new OddNumGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
