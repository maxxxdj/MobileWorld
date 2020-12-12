import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        Prints print = new Prints();
        ShopCart shop = new ShopCart();
        print.welcomeMessage();

        try {
            ShopCart cart = new ShopCart();
            cart.cartFill();

        } catch (Exception e) {
            shop.tryAgain();
        }

    }
}
