public class TestDrug {
    public static void main(String[] args) {
        Drug drug1 = new Drug(101, "Cetirizine Tablet", 10, "mg", "Tablet", "");
        Drug drug2 = new Drug(102, "Cetirizine Syrup", 5, "mg/5 mL", "Syrup", "");
        Drug drug3 = new Drug(103, "Amino Acid Solution Injection", 10, "%", "Injection", "");
        Drug drug4 = new Drug(104, "Amino Acid Solution Injection", 20, "%", "Injection", "");
        Drug drug5 = new Drug(105, "Amoxicillin Capsule", 250, "mg", "Capsule", "");
        Drug drug6 = new Drug(106, "Amoxicillin Capsule", 500, "mg", "Capsule", "");
        Drug drug7 = new Drug(107, "Diazepam Tablet", 5, "mg", "Tablet", "");
        Drug drug8 = new Drug(108, "Diazepam Tablet", 10, "mg", "Tablet", "");
        Drug drug9 = new Drug(109, "Folic Acid Tablet", 5, "mg", "Tablet", "(Blister Pack)");
        Drug drug10 = new Drug(110, "Metronidazole Tablet", 200, "mg", "Tablet", "");
        Drug drug11 = new Drug(111, "Metronidazole Tablet", 400, "mg", "Tablet", "");
        Drug drug12 = new Drug(112, "Multivitamin Drops", 0, "mL", "Drops", "");
        Drug drug13 = new Drug(113, "Multivitamin Syrup", 0, "mL", "Syrup", "");
        Drug drug14 = new Drug(114, "Paracetamol Syrup", 120, "mg/5 mL", "Syrup", "");
        Drug drug15 = new Drug(115, "Paracetamol Tablet", 500, "mg", "Tablet", "");
        Drug drug16 = new Drug(116, "Zinc Tablet", 10, "mg", "Tablet", "");
        Drug drug17 = new Drug(117, "Zinc Tablet", 20, "mg", "Tablet", "");

        displayDrugDetails(drug1);
        displayDrugDetails(drug2);
        // Display details for the rest of the drugs...

    }

    // Helper method to display drug details
    public static void displayDrugDetails(Drug drug) {
        System.out.println("Drug Code: " + drug.getDrugCode());
        System.out.println("Drug Name: " + drug.getDrugName());
        System.out.println("Dosage: " + drug.getDosage() + " " + drug.getUnit());
        System.out.println("Form: " + drug.getForm());
        System.out.println("Packaging: " + drug.getPackaging());
        System.out.println("-----------------------------");
    }
}
