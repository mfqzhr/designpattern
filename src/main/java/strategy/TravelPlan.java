package strategy;

public class TravelPlan {
    private Strategy strategy;

    public TravelPlan() {
        this.strategy = new WalkStrategy();
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(String start, String end) {
        strategy.execute(start,end);
    }
}
