package LukaszKutylowski.DiscountApp;

import java.math.BigDecimal;

public class PrintService {
    public void printSummary(Client client, BigDecimal priceBeforeDiscount, BigDecimal priceAfterDiscount) {
        printWelcome(client);
        printDiscount(priceBeforeDiscount, priceAfterDiscount);
    }

    private void printDiscount(BigDecimal priceBeforeDiscount, BigDecimal priceAfterDiscount) {
        System.out.println("Kwota przed rabatem: " + priceBeforeDiscount);
        System.out.println("Do zapłaty po rabacie: " + priceAfterDiscount);
    }

    private void printWelcome(Client client) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        if (firstName != null && lastName != null) {
            printFirstAndLastName(firstName, lastName);
        } else if (firstName != null && lastName == null) {
            printFirstName(firstName);
        } else if (firstName == null && lastName != null) {
            printLastName(lastName);
        } else {
            printUnknown();
        }
    }

    private void printUnknown() {
        System.out.println("Witaj nieznajomy");
    }

    private void printLastName(String lastName) {
        System.out.println("Dzień dobry Panie/Pani " + lastName);
    }

    private void printFirstName(String firstName) {
        System.out.println("Witaj " + firstName);
    }

    private void printFirstAndLastName(String firstName, String lastName) {
        System.out.println("Witaj " + firstName + " " + lastName);
    }
}
