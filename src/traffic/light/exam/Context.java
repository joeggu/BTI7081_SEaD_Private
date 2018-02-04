package traffic.light.exam;

public class Context {

    private State current;
    private State lastState;

    public Context(){
        this.current = new Green();
    }

    public void setState(State state){
        this.current = state;
    }

    public State getState(){
        return this.current;
    }

    public void setLastState(State state){
        this.lastState = state;
    }

    public State getLastState(){
        return this.lastState;
    }

    public void switchState(long sleep) throws InterruptedException {
        current.switchState(this, sleep);
    }
}
