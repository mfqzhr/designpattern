package observer.demo;

/**
 * @author 穆繁强
 * @date 2019/12/4
 * @description 图形观察者
 */
public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.print(generator.getGeneratorName() + "发生改变,翻译成图形: ");
        for (int i = 0; i < generator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
