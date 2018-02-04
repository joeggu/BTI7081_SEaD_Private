package facade.patern;

/**
 * Created by dario on 30.06.2017.
 */
public class Blackberry implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Blackberry Z10");
    }

    @Override
    public void price() {
        System.out.println(55000.00);
    }
}
