package Implementations.GPS;

public class GPSSimulation {
    public static void main(String[] args) {
        Route route = new Route();
        route.addPoint("Shopwise", 9.1312, 8.3234, "Market", 0);
        route.addPoint("CEUGP", 7.1312, 5.3234, "University", 3.2);
        route.addPoint("CEULV", 1.1312, 3.3234, "University", 7.2);

        route.displayRouteForwards();
        route.displayRouteBackwards();
    }
}
