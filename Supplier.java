public class Supplier {
    private int supplierCode;
    private String supplierName;
    private String location;

    public Supplier(int supplierCode, String supplierName, String location) {
        this.supplierCode = supplierCode;
        this.supplierName = supplierName;
        this.location = location;
    }

    // Getters and Setters
    public int getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(int supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
