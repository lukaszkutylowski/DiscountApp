package LukaszKutylowski.DiscountApp;

import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PrintServiceTest {

    PrintService service;
    OutputStream outputStream;
    PrintStream printStream;

    @Before
    public void setUp() {
        service = new PrintService();
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @Test
    public void should_print_message_when_firstName_and_lastName() {
        //given
        final String expectedSummary =
                        "Witaj Jan Kowalski\r\n" +
                        "Kwota przed rabatem: 1500\r\n" +
                        "Do zapłaty po rabacie: 1275";
        final String testFirstName = "Jan";
        final String testLastName = "Kowalski";
        final boolean testPremium = true;
        final Client testClient = new Client(testFirstName, testLastName, testPremium);
        final BigDecimal testPriceBeforeDiscount = new BigDecimal(1500);
        final BigDecimal testPriceAfterDiscount = new BigDecimal(1275);
        //when
        service.printSummary(testClient, testPriceBeforeDiscount, testPriceAfterDiscount);
        String actualSummary = outputStream.toString().trim();
        //then
        assertEquals(expectedSummary, actualSummary);
    }

    @Test
    public void should_print_message_when_firstName() {
        //given
        final String expectedSummary =
                        "Witaj Jan\r\n" +
                        "Kwota przed rabatem: 1500\r\n" +
                        "Do zapłaty po rabacie: 1275";
        final String testFirstName = "Jan";
        final String testLastName = null;
        final boolean testPremium = true;
        final Client testClient = new Client(testFirstName, testLastName, testPremium);
        final BigDecimal testPriceBeforeDiscount = new BigDecimal(1500);
        final BigDecimal testPriceAfterDiscount = new BigDecimal(1275);
        //when
        service.printSummary(testClient, testPriceBeforeDiscount, testPriceAfterDiscount);
        String actualSummary = outputStream.toString().trim();
        //then
        assertEquals(expectedSummary, actualSummary);
    }

    @Test
    public void should_print_message_when_lastName() {
        //given
        final String expectedSummary =
                        "Dzień dobry Panie/Pani Kowalski\r\n" +
                        "Kwota przed rabatem: 1500\r\n" +
                        "Do zapłaty po rabacie: 1275";
        final String testFirstName = null;
        final String testLastName = "Kowalski";
        final boolean testPremium = true;
        final Client testClient = new Client(testFirstName, testLastName, testPremium);
        final BigDecimal testPriceBeforeDiscount = new BigDecimal(1500);
        final BigDecimal testPriceAfterDiscount = new BigDecimal(1275);
        //when
        service.printSummary(testClient, testPriceBeforeDiscount, testPriceAfterDiscount);
        String actualSummary = outputStream.toString().trim();
        //then
        assertEquals(expectedSummary, actualSummary);
    }

    @Test
    public void should_print_message_when_no_name() {
        //given
        final String expectedSummary =
                        "Witaj nieznajomy\r\n" +
                        "Kwota przed rabatem: 1500\r\n" +
                        "Do zapłaty po rabacie: 1275";
        final String testFirstName = null;
        final String testLastName = null;
        final boolean testPremium = true;
        final Client testClient = new Client(testFirstName, testLastName, testPremium);
        final BigDecimal testPriceBeforeDiscount = new BigDecimal(1500);
        final BigDecimal testPriceAfterDiscount = new BigDecimal(1275);
        //when
        service.printSummary(testClient, testPriceBeforeDiscount, testPriceAfterDiscount);
        String actualSummary = outputStream.toString().trim();
        //then
        assertEquals(expectedSummary, actualSummary);
    }
}