import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String arg[]) {
        List<Product> products = new ArrayList<>();
        //seller
        Seller seller = new Seller();
        seller.setNipNumber("22112111");
        System.out.println(seller.getNipNumber());

        //product
//        Product product = new Product();
//        product.setProductPrice(12);
//        product.setProductTax(10);
////        System.out.println(product.getPriceWithTax());
//
//        //Customer
//        Customer customer = new Customer("testcomp", "sopot","88889999");
//
//        products.add(product);
//
////        Basket basket = new Basket(products);
//        System.out.println(basket.getSeller());
//
//        }
//        }
    }
}
