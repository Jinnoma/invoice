import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InvoiceTests {

    private Product product;
    private Product product1;
    private Seller seller;
    private Customer customer;
    private Invoice invoice;
    private Basket basket;

    @Before
    public void setup(){
        product = new Product("Masło", 1,  2);
        product1 = new Product("Masło", 2,  4);
        customer = new Customer("TesCompany","Sopot", "5665103268");
        seller = new Seller("TestSellerCompany", "Gdynia", "3772313002", "53811200083756651785145705" );
        basket = new Basket();
        basket.addProduct(product);
        basket.addProduct(product1);
        invoice = new Invoice(basket, customer, seller, "21.21.1990", "22.23.1990", 10);
    }

    @Test
    public void generateInvoice() {
        StringBuffer expected;
        StringBuffer result = new StringBuffer("asd");

        expected = invoice.generateInvoice();

        assertEquals(expected, result);
    }
}
