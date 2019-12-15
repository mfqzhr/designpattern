package observer.demo.observers.concrete;

import observer.demo.subjects.NumberGenerator;
import observer.demo.observers.Observer;

/**
 * @author 穆繁强
 * @date 2019/12/4
 * @description 数字观察者
 */
public class DigitalObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println(generator.getGeneratorName() + "发生改变,翻译成数字: " + generator.getNumber());
    }
}
