package LukaszKutylowski.DiscountApp;

public class DiscountService {
    public double calculateDiscountPrice(Client client, double price) {
        if (client.isClientPremium()) {
            return calculatePremiumDiscount(price);
        } else {
            return calculateStandardDiscount(price);
        }
    }

    double calculateStandardDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.1);
        } else {
            return price;
        }
    }

    double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.15);
        } else {
            return applyDiscount(price, 0.05);
        }
    }

    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }
}
