import java.util.ArrayList;

public class Drug {
    private int drugCode;
    private String drugName;
    private double dosage;
    private String unit;
    private String form;
    private String packaging;
    private ArrayList<PurchaseHistory> purchaseHistory;
    private ArrayList<Supplier> suppliers;

    public Drug(int drugCode, String drugName, double dosage, String unit, String form, String packaging) {
        this.drugCode = drugCode;
        this.drugName = drugName;
        this.dosage = dosage;
        this.unit = unit;
        this.form = form;
        this.packaging = packaging;
        this.purchaseHistory = new ArrayList<>();
        this.suppliers = new ArrayList<>();
    }

    // Getters and Setters
    public int getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(int drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public ArrayList<PurchaseHistory> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void addPurchaseHistory(PurchaseHistory purchase) {
        purchaseHistory.add(purchase);
    }
    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public ArrayList<Supplier> getSuppliers() {
        return suppliers;
    }
}
