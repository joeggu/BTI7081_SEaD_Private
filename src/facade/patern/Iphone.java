package facade.patern;

/**
 * Created by dario on 30.06.2017.
 */
public class Iphone implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("iPhone 6");
    }

    @Override
    public void price() {
        System.out.println(65000.00);
    }
}
