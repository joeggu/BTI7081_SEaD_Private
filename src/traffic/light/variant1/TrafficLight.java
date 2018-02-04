package traffic.light.variant1;

/**
 * Created by dario on 21.06.2017.
 */
public class TrafficLight {
    private State current;

    public TrafficLight(){
        current = new RED();
    }

    public State getState(){
        return this.current;
    }

    public void setState(State state){
        this.current = state;
    }

    public void push(){
        current.push(this);
    }
}
