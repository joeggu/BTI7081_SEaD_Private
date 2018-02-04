package stoppwatch;

/**
 * Created by dario on 13.07.2017.
 */
public class Idle extends State {


    public Idle(StoppWatch stoppWatch){
        super(stoppWatch);
    }

    @Override
    protected void doEntry(){
        stoppWatch.resetTimer();
        stoppWatch.displayCurrentTime();
    }

    @Override
    protected void handleB1(){
        stoppWatch.startTimer();
        stoppWatch.setState(stoppWatch.getRunning());
    }
}
