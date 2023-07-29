import java.time.LocalDateTime;
import java.util.ArrayList;

public class PharmacyManagementSystem {
    private ArrayList<Drug> drugs;

    public PharmacyManagementSystem() {
        drugs = new ArrayList<>();
    }

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public void removeDrugByCode(int drugCode) {
        for (int i = 0; i < drugs.size(); i++) {
            if (drugs.get(i).getDrugCode() == drugCode) {
                drugs.remove(i);
                break;
            }
        }
    }

    public Drug searchDrugByName(String drugName) {
        for (Drug drug : drugs) {
            if (drug.getDrugName().equalsIgnoreCase(drugName)) {
                return drug;
            }
        }
        return null;
    }

    public Drug searchDrugByCode(int drugCode) {
        for (Drug drug : drugs) {
            if (drug.getDrugCode() == drugCode) {
                return drug;
            }
        }
        return null;
    }

    public void sellDrug(int drugCode, String buyer, int quantityPurchased, double totalAmount) {
        Drug drug = searchDrugByCode(drugCode);
        if (drug != null) {
            PurchaseHistory purchase = new PurchaseHistory(LocalDateTime.now(), buyer, quantityPurchased, totalAmount);
            drug.addPurchaseHistory(purchase);
        } else {
            System.out.println("Drug with code " + drugCode + " not found.");
        }
    }
    public void displayAllDrugs() {
        System.out.println("---- All Drugs----");
        for (Drug drug : drugs) {
            System.out.println("Drug Code: " + drug.getDrugCode());
            System.out.println("Drug Name: " + drug.getDrugName());
            System.out.println("Dosage: " + drug.getDosage() + " " + drug.getUnit());
            System.out.println("Form: " + drug.getForm());
            System.out.println("Packaging: " + drug.getPackaging());
            System.out.println("-----------------------------");
        }
    }
    public void displayAllSuppliers() {
        System.out.println("----- All Suppliers -----");
        for (Drug drug : drugs) {
            System.out.println("Drug Code: " + drug.getDrugCode());
            System.out.println("Drung Name: " + drug.getDrugName());
            System.out.println("Suppliers:");
            for (Supplier supplier : drug.getSuppliers()) {
                System.out.println("- Supplier Code: " + supplier.getSupplierCode());
                System.out.println(" Supplier Name: " + supplier.getSupplierName());
                System.out.println(" Location: " + supplier.getLocation());
            }
            System.out.println("----------------------------");
        }

    }
    public void displayPurchaseHistoryByDrugCode(int drugCode) {
        Drug drug = searchDrugByCode(drugCode);
        if (drug != null) {
            System.out.println("-----Purchase History for Drug Code " + drugCode + " ------ ");
            for (PurchaseHistory purchase : drug.getPurchaseHistory()) {
                System.out.println("Time: " + purchase.getPurchaseTime());
                System.out.println("Buyer : " + purchase.getBuyer());
                System.out.println("Quantity Purchased: " + purchase.getQuantityPurchased());
                System.out.println("Total Amount: $" +purchase.getTotalAmount());
                System.out.println("------------------------------");
            }
        } else {
            System.out.println("Drug with code " + drugCode + " not found. ");
        }
    }

    public void displayAllDuppliers() {
    }
}
