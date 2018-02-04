package state.design.pattern;

/**
 * Created by dario on 21.06.2017.
 */
public class TestIt {
    public static void main(String[] args) {
        Context context = new Context();
        int[] msgs = {2,1,2,1,0,2,0,0};
        for(int msg : msgs){
            if(msg == 0){
                context.on();
            }else if (msg == 1){
                context.off();
            }else if(msg == 2){
                context.ack();
            }
        }
    }
}
