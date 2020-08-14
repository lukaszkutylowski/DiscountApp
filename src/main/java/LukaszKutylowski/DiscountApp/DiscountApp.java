package LukaszKutylowski.DiscountApp;

import java.math.BigDecimal;

public class DiscountApp {
    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        PrintService printService = new PrintService();

        Client client1 = new Client(null, null, true);
        BigDecimal price1 = new BigDecimal(1100);
        BigDecimal discountPrice1 = service.calculateDiscountPrice(client1, price1);
        printService.printSummary(client1, price1, discountPrice1);

        Client client2 = new Client("Karol", "Nowak", false);
        BigDecimal price2 = new BigDecimal(1100);
        BigDecimal discountPrice2 = service.calculateDiscountPrice(client2, price2);
        printService.printSummary(client2, price2, discountPrice2);
    }
}
