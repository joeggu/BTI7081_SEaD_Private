package state.design.pattern;

/**
 * Created by dario on 21.06.2017.
 */
public class Context {

    private State[] states = {new A(), new B(), new C()};

    private int[][] transistion ={{2,1,0},{0,2,1},{1,2,3}};

    private int current = 0;

    private void next(int msg){
        current = transistion[current][msg];
    }

    public void on(){
        states[current].on();
        next(0);
    }

    public void off(){
        states[current].off();
        next(1);
    }

    public void ack(){
        states[current].ack();
        next(2);
    }
}
