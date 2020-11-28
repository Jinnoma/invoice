import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> basket = new ArrayList<>();
    private Product product;

    public Basket() {
    }

    public void addProduct(Product product){
        basket.add(product);
    }

    public List<Product> getProducts(){
        return basket;
    }


}
