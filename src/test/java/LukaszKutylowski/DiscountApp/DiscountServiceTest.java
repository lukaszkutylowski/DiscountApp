package LukaszKutylowski.DiscountApp;

import org.junit.Test;
import org.junit.Before;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        final BigDecimal testPrice1 = new BigDecimal(1500).setScale(2, RoundingMode.HALF_UP);
        final BigDecimal testPrice2 = new BigDecimal(500).setScale(2, RoundingMode.HALF_UP);
        final BigDecimal expectedDiscountPrice1 = new BigDecimal(1275).setScale(2, RoundingMode.HALF_UP);
        final BigDecimal expectedDiscountPrice2 = new BigDecimal(475).setScale(2, RoundingMode.HALF_UP);
        //when
        BigDecimal actualDiscountPrice1 = service.calculateDiscountPrice(testClient, testPrice1).setScale(2, RoundingMode.HALF_UP);
        BigDecimal actualDiscountPrice2 = service.calculateDiscountPrice(testClient, testPrice2).setScale(2, RoundingMode.HALF_UP);
        //then
        assertEquals(expectedDiscountPrice1, actualDiscountPrice1);
        assertEquals(expectedDiscountPrice2, actualDiscountPrice2);
    }

    @Test
    public void should_calculate_discount_price_when_standard() {
        //given
        final String testFirstName = "Jan";
        final String testLastName = "Kowalski";
        final boolean testPremium = false;
        final Client testClient = new Client(testFirstName, testLastName, testPremium);
        final BigDecimal testPrice1 = new BigDecimal(1500).setScale(2, RoundingMode.HALF_UP);
        final BigDecimal testPrice2 = new BigDecimal(500).setScale(2, RoundingMode.HALF_UP);
        final BigDecimal expectedDiscountPrice1 = new BigDecimal(1350).setScale(2, RoundingMode.HALF_UP);
        final BigDecimal expectedDiscountPrice2 = new BigDecimal(500).setScale(2, RoundingMode.HALF_UP);
        //when
        BigDecimal actualDiscountPrice1 = service.calculateDiscountPrice(testClient, testPrice1).setScale(2, RoundingMode.HALF_UP);
        BigDecimal actualDiscountPrice2 = service.calculateDiscountPrice(testClient, testPrice2).setScale(2, RoundingMode.HALF_UP);
        //then
        assertEquals(expectedDiscountPrice1, actualDiscountPrice1);
        assertEquals(expectedDiscountPrice2, actualDiscountPrice2);
    }
}