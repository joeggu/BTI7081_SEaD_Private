package stoppwatch;

/**
 * Created by dario on 13.07.2017.
 */
public class Running extends State {

    public Running(StoppWatch stoppWatch){
        super(stoppWatch);
    }

    @Override
    protected void startDo(){
        stoppWatch.displayCurrentTime();
    }

    @Override
    protected void handleB1(){
        stoppWatch.setState(stoppWatch.getIntermediate());
    }

    @Override
    protected void handleB2(){
        stoppWatch.stopTimer();
        stoppWatch.setState(stoppWatch.getStopped());
    }
}
