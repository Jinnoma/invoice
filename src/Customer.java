public class Customer {
    private String companyName;
    private String address;
    private String nipNumber;

    public Customer(String companyName, String address, String nipNumber) {
        this.companyName = companyName;
        this.address = address;
        setNipNumber(nipNumber);
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
        if (nipNumber.length() != 10){
            throw new IllegalArgumentException("Nieprawidłowy numer NIP");
        }
        this.nipNumber = nipNumber;
    }
}
