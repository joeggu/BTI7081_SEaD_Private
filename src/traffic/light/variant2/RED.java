package traffic.light.variant2;

/**
 * Created by dario on 21.06.2017.
 */
public class RED implements State {

    public void push(TrafficLight trafficLight){
        System.out.println("ROT!!");
        trafficLight.setState(trafficLight.getYellow());
    }
}
