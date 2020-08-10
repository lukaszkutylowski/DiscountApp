package LukaszKutylowski.DiscountApp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void should_create_client_object() {
        //given
        final String expectedFirstName = "Jan";
        final String expectedLastName = "Kowalski";
        final boolean expectedClientPremium = true;
        //when
        Client client = new Client(expectedFirstName, expectedLastName, expectedClientPremium);
        String actualFirstName = client.getFirstName();
        String actualLastName = client.getLastName();
        boolean actualClientPremium = client.isClientPremium();
        //then
        assertEquals(expectedFirstName, actualFirstName);
        assertEquals(expectedLastName, actualLastName);
        assertEquals(expectedClientPremium, actualClientPremium);
    }
}