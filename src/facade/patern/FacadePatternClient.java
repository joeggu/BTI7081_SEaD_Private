package facade.patern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dario on 30.06.2017.
 */
public class FacadePatternClient {

    private static int choice;

    public static void main(String[] args) throws IOException {
        ShopKeeper shopKeeper = new ShopKeeper();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("========= Mobile Shop =========");
            System.out.println("          1. iPhone");
            System.out.println("          2. Samsung");
            System.out.println("          3. BlackBerry");
            System.out.println("          4. Exit");
            System.out.println("\nEnter your choice:");

            try {
                choice = Integer.parseInt(bufferedReader.readLine());
            } catch (IllegalArgumentException ex){
                System.out.println("please enter a number!!");
            }

            switch (choice) {
                case 1:
                    shopKeeper.iPhoneSale();
                    break;
                case 2:
                    shopKeeper.samsungSale();
                    break;
                case 3:
                    shopKeeper.blackBerrySale();
                    break;
                case 4:
                    System.out.println("BYE BYE");
                    break;
                default:
                    System.out.println("Nothing you purchase");
                    break;
            }
            }while(choice != 4);
    }
}
