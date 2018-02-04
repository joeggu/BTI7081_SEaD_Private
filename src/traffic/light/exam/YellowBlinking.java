package traffic.light.exam;

public class YellowBlinking implements State{
    @Override
    public void switchState(Context context, long sleep) throws InterruptedException {
        for(int i = 0; i < 10; i++){
            Thread.sleep(1000);
            System.out.println("yellow-blinking...");
        }
    }
}
