package observer.tank;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class Main {
    public static void main(String[] args) {
        TankFrame tankFrame = new TankFrame();
        while (true) {
            try {
                Thread.sleep(10);
                tankFrame.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
