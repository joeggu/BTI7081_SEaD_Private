package traffic.light.variant2;

/**
 * Created by dario on 21.06.2017.
 */
public class GREEN implements State{

    @Override
    public void push(TrafficLight trafficLight) {
        System.out.println("Grün!...");
        trafficLight.setState(trafficLight.getRed());
    }
}
