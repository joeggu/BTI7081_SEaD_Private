package stoppwatch;

import java.util.Timer;

/**
 * Created by dario on 13.07.2017.
 */
public class StoppWatch {

    private State current;
    private State idle;
    private State running;
    private State intermediate;
    private State stopped;

    private Timer timer = new Timer();

    public StoppWatch(){
        idle = new Idle(this);
        running = new Running(this);
        intermediate = new Intermediate(this);
        stopped = new Stopped(this);
        current = idle;
    }

    public void setState(State newState){
        this.current = newState;
        current.entry();
    }

    public State getIdle() {
        return idle;
    }

    public State getRunning() {
        return running;
    }

    public State getIntermediate() {
        return intermediate;
    }

    public State getStopped() {
        return stopped;
    }

    public void handleB1(){
        current.exit();
        current.handleB1();
    }

    public void handleB2(){
        current.exit();
        current.handleB2();
    }

    void resetTimer(){}
    void startTimer(){}
    void stopTimer(){}
    void displayCurrentTime(){}
    void displayIntermediateTime(){}

}
