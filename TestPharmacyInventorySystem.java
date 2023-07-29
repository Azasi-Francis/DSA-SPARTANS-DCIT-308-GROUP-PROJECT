public class TestPharmacyManagementSystem {
    public static void main(String[] args) {
        PharmacyManagementSystem pharmacySystem = new PharmacyManagementSystem();

        // Adding drugs
        pharmacySystem.addDrug(new Drug(101, "Cetirizine Tablet", 10, "mg", "Tablet", ""));
        pharmacySystem.addDrug(new Drug(102, "Cetirizine Syrup", 5, "mg/5 mL", "Syrup", ""));
        pharmacySystem.addDrug(new Drug(103, "Amino Acid Solution Injection", 10, "%", "Injection", ""));

        // Testing sellDrug method and purchase history
        pharmacySystem.sellDrug(101, "John Doe", 5, 25.0);
        pharmacySystem.sellDrug(101, "Jane Smith", 3, 15.0);

        // Displaying all drugs and their suppliers
        pharmacySystem.displayAllDrugs();
        pharmacySystem.displayAllDuppliers();

        // Displaying purchase history for drug with code 101
        Drug drug101 = pharmacySystem.searchDrugByCode(101);
        if (drug101 != null) {
            System.out.println("Purchase History for Drug with Code 101:");
            for (PurchaseHistory purchase : drug101.getPurchaseHistory()) {
                System.out.println("Time: " + purchase.getPurchaseTime());
                System.out.println("Buyer: " + purchase.getBuyer());
                System.out.println("Quantity Purchased: " + purchase.getQuantityPurchased());
                System.out.println("Total Amount: $" + purchase.getTotalAmount());
                System.out.println("-----------------------------");
            }
        } else {
            System.out.println("Drug with code 101 not found.");
        }
    }
}
