package traffic.light.variant2;

/**
 * Created by dario on 21.06.2017.
 */
public class TrafficLight {
    private State current;
    private State green;
    private State yellow;
    private State red;

    public TrafficLight(){
        green = new GREEN();
        yellow = new YELLOW();
        red = new RED();
        current = red;
    }

    public State getGreen(){
        return this.green;
    }

    public State getYellow(){
        return this.yellow;
    }

    public State getRed() {
        return this.red;
    }

    public void setState(State state){
        this.current = state;
    }

    public void push(){
        current.push(this);
    }
}
