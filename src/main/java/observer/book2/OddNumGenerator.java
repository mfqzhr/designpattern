package observer.book2;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class OddNumGenerator extends NumGenerator {

    private int number = 0;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i = i + 2) {
            number = i;
            notifyObservers();
        }
    }
}
