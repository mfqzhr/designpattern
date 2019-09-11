/**
 * @author mufanqiang
 * 饿汉模式
 */
public class Main01 {
    private static final Main01 INSTANCE = new Main01();

    private Main01() {
    }

    public static Main01 getInstance() {
        return INSTANCE;
    }
}
