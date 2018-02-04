package traffic.light.exam;

public class TestThatFuckingShit {

    public static void main(String[] args) throws InterruptedException {
        Context context = new Context();

        long sleep;
        for (int i = 0; i < 10; i++){
            if(i % 4 == 0){
                sleep = 2000;
            } else if (i % 4 ==1){
                sleep = 3000;
            } else if (i % 4 == 2){
                sleep = 4000;
            } else {
                sleep = 3000;
            }
            context.switchState(sleep);
        }

        context.setState(new YellowBlinking());
        context.switchState(10000);
    }
}
