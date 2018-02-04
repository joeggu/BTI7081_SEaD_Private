package stoppwatch;

/**
 * Created by dario on 13.07.2017.
 */
abstract class State {

    protected StoppWatch stoppWatch;

    protected State(StoppWatch stoppWatch){
        this.stoppWatch = stoppWatch;
    }

    final void entry(){
        doEntry();
        startDo();
    }

    final void exit(){
        stopDo();
        doExit();
    }

    protected void doEntry(){}
    protected void startDo(){}
    protected void stopDo(){}
    protected void doExit(){}

    protected void handleB1(){}
    protected void handleB2(){}
}
