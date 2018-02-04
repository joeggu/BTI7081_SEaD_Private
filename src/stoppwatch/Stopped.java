package stoppwatch;

/**
 * Created by dario on 13.07.2017.
 */
public class Stopped extends State {


    public Stopped(StoppWatch stoppWatch){
        super(stoppWatch);
    }

    @Override
    protected void doEntry(){
        stoppWatch.displayCurrentTime();
    }

    @Override
    protected void handleB1(){
        stoppWatch.handleB1();
        stoppWatch.resetTimer();
    }

    @Override
    protected void handleB2(){
        stoppWatch.setState(stoppWatch.getIdle());
    }
}
