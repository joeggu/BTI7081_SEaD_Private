package state.design.pattern;

/**
 * Created by dario on 21.06.2017.
 */
public class A extends State{
    public void on(){
        System.out.println("A + on = C");
    }

    public void off(){
        System.out.println("A + off = B");
    }

    public void ack(){
        System.out.println("A + ack = A");
    }
}
