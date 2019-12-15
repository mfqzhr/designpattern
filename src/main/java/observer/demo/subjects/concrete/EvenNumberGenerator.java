package observer.demo.subjects.concrete;

import observer.demo.subjects.NumberGenerator;

/**
 * @author 穆繁强
 * @date 2019/12/4
 * @description 用于生成偶数, 具体的被观察者
 */
public class EvenNumberGenerator extends NumberGenerator {
    private int number;
    private String name = "偶数计数器";

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getGeneratorName() {
        return name;
    }

    @Override
    public void execute() {
        for (int i = 0; i <= 20; i = i + 2) {
            number = i;
            notifyObservers();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
