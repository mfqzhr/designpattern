package observer.demo.subjects.concrete;


import observer.demo.subjects.NumberGenerator;

import java.util.Random;

/**
 * @author 穆繁强
 * @date 2019/12/3
 * @description 用于生成随机数,具体的被观察对象
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    private String name = "随机数计数器";

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
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
