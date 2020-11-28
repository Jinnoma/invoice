import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {
    private static int id = 1;
    private final int invoiceId;
    private final Date invoiceDate;
    private Basket basket;
    private Customer customer;
    private Seller seller;
    private String paymentDate;
    private String sellDate;
    private int tax;
    private ArrayList<String> generatedInvoice = new ArrayList<>();

    public Invoice(Basket basket, Customer customer, Seller seller, String paymentDate, String sellDate, int tax) {
        this.invoiceId = id;
        Invoice.id++;
        this.tax = tax;
        this.basket = basket;
        this.customer = customer;
        this.seller = seller;
        this.paymentDate = paymentDate;
        this.sellDate = sellDate;
        this.invoiceDate = new Date();
    }

    public float getInvoiceWithTax() {
        List<Product> productList;
        productList = basket.getProducts();
        float result = 0;
        for (Product l : productList) {
            result += l.getProductsPrice();
        }
        return result + result * tax / 100;

    }

//    public float getProductWitTax(){
//        float result;
//        Product product1 = basket.getProduct();
//        result = (float) (product1.getProductAmount() * ( product1.getProductPrice() +  product1.getProductPrice() * tax/100));
//        return result;
//    }


    public StringBuffer generateInvoice() {
        List<Product> productList;
        productList = basket.getProducts();
        StringBuffer sb = new StringBuffer();
        float totalPriceWithTax = getInvoiceWithTax();

        for (Product l : productList) {
            sb.append("Nazwa Produktu: " + l.getProductName() +
                    ", Ilość zamówionego towaru: " + l.getProductAmount());
            sb.append(System.lineSeparator());

            sb.append("Cena netto: " + l.getProductPrice() + " Cena netto pozycji: " + l.getProductsPrice());
            sb.append(System.lineSeparator());

            sb.append(" Podatek: " + tax +"%"
                    + " Wyliczona cena brutto: " + " jakas metoda ");
            sb.append(System.lineSeparator());
        }
        sb.append("Wartość całkowita faktury: " + totalPriceWithTax);
        sb.append(System.lineSeparator());

        sb.append(" Nazwa firmy klienta: " + customer.getCompanyName());

        sb.append(System.lineSeparator());
        sb.append(" Adres firmy klienta: " + customer.getAddress());

        sb.append(System.lineSeparator());
        sb.append(" Numer NIP: " + customer.getNipNumber());

        sb.append(System.lineSeparator());
        sb.append(" Nazwa firmy sprzedającego : " + seller.getCompanyName());

        sb.append(System.lineSeparator());
        sb.append(" Adres sprzedającego : " + seller.getAddress());

        sb.append(System.lineSeparator());
        sb.append(" Numer NIP : " + seller.getNipNumber());

        sb.append(System.lineSeparator());
        sb.append(" Numer konta : " + seller.getAccountNumber());

        sb.append(System.lineSeparator());
        sb.append(" Numer faktury: " + invoiceId);

        sb.append(System.lineSeparator());
        sb.append(" payment date: " + paymentDate);

        sb.append(System.lineSeparator());
        sb.append(", sell date: " + sellDate);

        sb.append(System.lineSeparator());
        sb.append(", invoice date: " + invoiceDate);

        return sb;
    }


}


