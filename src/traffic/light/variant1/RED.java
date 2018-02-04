package traffic.light.variant1;

/**
 * Created by dario on 21.06.2017.
 */
public class RED implements State {

    public void push(TrafficLight trafficLight){
        trafficLight.setState(new YELLOW());
        System.out.println("ROT!!");
    }
}
