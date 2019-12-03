package observer.msb.v2;

/**
 * 面向对象的傻等
 * @author 穆繁强
 * @date 2019/12/2
 */
class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Waked Up ! Crying");
        cry = true;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Child child = new Child();
        while (!child.isCry()) {
            Thread.sleep(1000);
            System.out.println("observing.....");
        }
    }

}
