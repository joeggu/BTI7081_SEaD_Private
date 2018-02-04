package traffic.light.exam;

public class Yellow implements State {

    @Override
    public void switchState(Context context, long sleep) throws InterruptedException {
        System.out.println("Yellow!");
        Thread.sleep(sleep);
        if(context.getLastState() instanceof Red){
            context.setState(new Green());
        } else {
            context.setState(new Red());
        }
        context.setLastState(this);
    }
}
