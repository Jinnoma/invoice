
public class Seller {
    private String companyName;
    private String address;
    private String nipNumber;
    private String accountNumber;

    public Seller(){}

    public Seller(String companyName, String address, String nipNumber, String accountNumber) {
        this.companyName = companyName;
        this.address = address;
        setNipNumber(nipNumber);
        setAccountNumber(accountNumber);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNipNumber() {
        return nipNumber;
    }

    public void setNipNumber(String nipNumber) {
//        if (nipNumber.length() != 8){
//            throw new IllegalArgumentException("Nieprawidłowy numer NIP");
//        }
        this.nipNumber = nipNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() != 26){
            throw new IllegalArgumentException("Nieprawidłowy numer konta");
        }
        this.accountNumber = accountNumber;
    }
}

