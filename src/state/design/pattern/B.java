package state.design.pattern;

/**
 * Created by dario on 21.06.2017.
 */
public class B extends State {
    public void on(){
        System.out.println("B + on = A");
    }

    public void off(){
        System.out.println("B + off = C");
    }
}
