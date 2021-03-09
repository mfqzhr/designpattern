package strategy;

public class CarStrategy implements Strategy {

    @Override
    public void execute(String start, String end) {
        System.out.println("打车出行: 始发地: " + start + " 目的地: " + end);
    }
}
