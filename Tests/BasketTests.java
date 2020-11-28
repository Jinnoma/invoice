import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasketTests {

    private Basket basket;
    private Product product;

    @Before
    public void setup(){
        basket = new Basket();
        product = new Product("Masło", 2.3,  1);
    }

    @Test
    public void addProduct() {
        basket.addProduct(product);
    }

}
