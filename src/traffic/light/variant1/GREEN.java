package traffic.light.variant1;

/**
 * Created by dario on 21.06.2017.
 */
public class GREEN implements State{

    @Override
    public void push(TrafficLight trafficLight) {
        trafficLight.setState(new RED());
        System.out.println("Grün!...");
    }
}
