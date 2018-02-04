package traffic.light.exam;

interface State {

    public void switchState(Context context, long sleep) throws InterruptedException;
}
