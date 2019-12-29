package bridge;

/**
 * @author 穆繁强
 * @date 2019/12/28
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void disPlay() {
        open();
        print();
        close();
    }

}
