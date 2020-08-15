package LukaszKutylowski.DiscountApp;

import java.math.BigDecimal;

public class DiscountService {
    public BigDecimal calculateDiscountPrice(Client client, BigDecimal price) {
        if (client.isClientPremium()) {
            return calculatePremiumDiscount(price);
        } else {
            return calculateStandardDiscount(price);
        }
    }

    private BigDecimal calculateStandardDiscount(BigDecimal price) {
        if (price.compareTo(BigDecimal.valueOf(1000)) > 0) {
            return applyDiscount(price, new BigDecimal(0.1));
        } else {
            return price;
        }
    }

    private BigDecimal calculatePremiumDiscount(BigDecimal price) {
        if (price.compareTo(BigDecimal.valueOf(1000)) > 0) {
            return applyDiscount(price, new BigDecimal(0.15));
        } else {
            return applyDiscount(price, new BigDecimal(0.05));
        }
    }

    private BigDecimal applyDiscount(BigDecimal price, BigDecimal discount) {
        return price.multiply(new BigDecimal(1).subtract(discount));
    }
}
