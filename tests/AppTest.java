import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @Test
    public void testObjects() throws IOException {
        App app = new App();
        ShopCart shopCart = new ShopCart();
        Prints prints = new Prints();
        Phone phone = new Phone();
        Alcatel alcatel = new Alcatel();
        iPhone iPhone = new iPhone();
        Huawei huawei = new Huawei();
        Nokia nokia = new Nokia();
        Samsung samsung = new Samsung();



        //Not null

        Assertions.assertNotNull(shopCart);
        Assertions.assertNotNull(app);
        Assertions.assertNotNull(phone);
        Assertions.assertNotNull(alcatel);
        Assertions.assertNotNull(nokia);
        Assertions.assertNotNull(huawei);
        Assertions.assertNotNull(iPhone);
        Assertions.assertNotNull(samsung);
        Assertions.assertNotNull(prints);


    }


}