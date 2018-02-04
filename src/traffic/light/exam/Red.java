package traffic.light.exam;

public class Red implements State {

    @Override
    public void switchState(Context context, long sleep) throws InterruptedException {
        System.out.println("Red!");
        Thread.sleep(sleep);
        context.setLastState(this);
        context.setState(new Yellow());
    }
}
