import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SellerTests {

    private Seller seller;

    @Before
    public void setup(){
        seller = new Seller();
    }

    @Test
    public void addSeller() {
        seller.setCompanyName("XXX");
        String name = seller.getCompanyName();
        assertEquals("XXX", name);
    }
}
