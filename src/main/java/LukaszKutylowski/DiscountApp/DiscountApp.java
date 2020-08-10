package LukaszKutylowski.DiscountApp;

public class DiscountApp {
    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        PrintService printService = new PrintService();

        Client client1 = new Client(null, null, true);
        double price1 = 1100;
        double discountPrice1 = service.calculateDiscountPrice(client1, price1);
        printService.printSummary(client1, price1, discountPrice1);

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;
        double discountPrice2 = service.calculateDiscountPrice(client2, price2);
        printService.printSummary(client2, price2, discountPrice2);
    }
}
