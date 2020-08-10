package LukaszKutylowski.DiscountApp;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class DiscountServiceTest {

    DiscountService service;

    @Before
    public void setUp() {
        service = new DiscountService();
    }

    @Test
    public void should_calculate_discount_price_when_premium() {
        //given
        final String testFirstName = "Jan";
        final String testLastName = "Kowalski";
        final boolean testPremium = true;
        final Client testClient = new Client(testFirstName, testLastName, testPremium);
        final double testPrice1 = 1500;
        final double testPrice2 = 500;
        final double expectedDiscountPrice1 = 1275;
        final double expectedDiscountPrice2 = 475;
        final double delta = 1e-2;
        //when
        double actualDiscountPrice1 = service.calculateDiscountPrice(testClient, testPrice1);
        double actualDiscountPrice2 = service.calculateDiscountPrice(testClient, testPrice2);
        //then
        assertEquals(expectedDiscountPrice1, actualDiscountPrice1, delta);
        assertEquals(expectedDiscountPrice2, actualDiscountPrice2, delta);
    }

    @Test
    public void should_calculate_discount_price_when_standard() {
        //given
        final String testFirstName = "Jan";
        final String testLastName = "Kowalski";
        final boolean testPremium = false;
        final Client testClient = new Client(testFirstName, testLastName, testPremium);
        final double testPrice1 = 1500;
        final double testPrice2 = 500;
        final double expectedDiscountPrice1 = 1350;
        final double expectedDiscountPrice2 = 500;
        final double delta = 1e-2;
        //when
        double actualDiscountPrice1 = service.calculateDiscountPrice(testClient, testPrice1);
        double actualDiscountPrice2 = service.calculateDiscountPrice(testClient, testPrice2);
        //then
        assertEquals(expectedDiscountPrice1, actualDiscountPrice1, delta);
        assertEquals(expectedDiscountPrice2, actualDiscountPrice2, delta);
    }
}