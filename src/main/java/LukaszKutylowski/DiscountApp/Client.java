package LukaszKutylowski.DiscountApp;

public class Client {
    private String firstName;
    private String lastName;
    private boolean clientPremium;

    public Client(String firstName, String lastName, boolean clientPremium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientPremium = clientPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isClientPremium() {
        return clientPremium;
    }

    public void setClientPremium(boolean clientPremium) {
        this.clientPremium = clientPremium;
    }
}
