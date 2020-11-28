public class Product {
    private String productName;
    private double productPrice;
    private int productAmount;

    public Product(String productName, double productPrice, int productAmount){

        this.productName = productName;
        this. productAmount = productAmount;
        this.productPrice = productPrice;

    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductsPrice(){
        return productAmount * productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

}
