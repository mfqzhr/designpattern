package bridge;

/**
 * @author 穆繁强
 * @date 2019/12/29
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello MFQ"));
        d1.disPlay();
        d2.disPlay();
        d3.disPlay();
        d3.multiDisplay(5);
    }
}
