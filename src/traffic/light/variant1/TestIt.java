package traffic.light.variant1;

/**
 * Created by dario on 21.06.2017.
 */
public class TestIt {
    public static void main(String[] args) throws InterruptedException {

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.push();
        for(int i = 0; i < 100; i++){
            Thread.sleep(1000);
            trafficLight.push();

            i++;
        }

        /**
        InputStreamReader is = new InputStreamReader(System.in);
        TrafficLight btn = new TrafficLight();
        while(true){
            System.out.println("Press Enter");
            is.read();
            btn.push();
        }*/
    }
}
