import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductTests {

    private Product product;

    @Before
    public void setup(){
        product = new Product("Masło", 2.3,  1);
    }

    @Test
    public void getProductName() {
        String result = product.getProductName();
        String expected = "Masło";
        assertEquals(expected, result);
    }
}
