package facade.patern;

/**
 * Created by dario on 30.06.2017.
 */
public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Samsung Galaxy Tab 3");
    }

    @Override
    public void price() {
        System.out.println(45000.00);
    }
}
