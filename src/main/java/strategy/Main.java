package strategy;

public class Main {

    public static void main(String[] args) {
        TravelPlan travelPlan = new TravelPlan();
        travelPlan.setStrategy(new CarStrategy());
        travelPlan.executeStrategy("北京", "天津");
    }
}
