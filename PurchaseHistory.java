import java.time.LocalDateTime;

public class PurchaseHistory {
    private LocalDateTime purchaseTime;
    private String buyer;
    private int quantityPurchased;
    private double totalAmount;

    public PurchaseHistory(LocalDateTime purchaseTime, String buyer, int quantityPurchased, double totalAmount) {
        this.purchaseTime = purchaseTime;
        this.buyer = buyer;
        this.quantityPurchased = quantityPurchased;
        this.totalAmount = totalAmount;
    }

    // Getters
    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }

    public String getBuyer() {
        return buyer;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
