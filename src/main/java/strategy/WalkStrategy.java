package strategy;

/**
 * 步行策略
 */
public class WalkStrategy implements Strategy {
    @Override
    public void execute(String start, String end) {
        System.out.println("步行: 始发地: " + start + " 目的地: " + end);
    }
}
