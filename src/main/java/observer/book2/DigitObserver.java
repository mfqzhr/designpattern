package observer.book2;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class DigitObserver implements Observer {

    @Override
    public void update(NumGenerator generator) {
        int number = generator.getNumber();
        System.out.println("DigitObserver: " + number);
    }
}
