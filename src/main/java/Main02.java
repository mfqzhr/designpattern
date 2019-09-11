import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author mufanqiang
 * lazy loading
 * 懒汉模式
 * 解决方式: 加锁
 */
public class Main02 {
    private static Main02 INSTANCE;

    private Main02() {

    }

    public static synchronized Main02 getInstance() {
        if (INSTANCE == null) {

            INSTANCE = new Main02();

        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Main02.getInstance().hashCode());
            }).start();
        }
    }
}
