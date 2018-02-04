package traffic.light.exam;

public class Green implements State{

    public void switchState(Context context, long sleep) throws InterruptedException {
        System.out.println("Green!");
        Thread.sleep(sleep);
        context.setLastState(this);
        context.setState(new Yellow());
    }
}
