package observer.book2;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class GraphObserver implements Observer {

    @Override
    public void update(NumGenerator generator) {
        System.out.print("GraphObserver: ");
        for (int i = 0; i < generator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
