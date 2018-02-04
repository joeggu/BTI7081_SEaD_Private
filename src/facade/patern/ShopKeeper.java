package facade.patern;

/**
 * Created by dario on 30.06.2017.
 */
public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public ShopKeeper(){
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }

    public void iPhoneSale(){
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }

    public void blackBerrySale(){
        blackberry.modelNo();
        blackberry.price();
    }
}
