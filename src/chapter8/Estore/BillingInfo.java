package chapter8.Estore;

public class BillingInfo {
    private String receiverName;
    private String receiverPhone;
    private Address deliveryAddress;

    private CreditCardInfo creditCard;

    public BillingInfo() {
        deliveryAddress = new Address();
        creditCard = new CreditCardInfo("John Doe", "1234567890123456", 2004, 02, 123);
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
    public void addDeliveryAddress(Address address) {
        deliveryAddress = address;
    }
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }
    public void addCreditCard(CreditCardInfo cardInfo) {
        creditCard = cardInfo;
    }

    public CreditCardInfo getCreditCard() {
        return creditCard;
    }
}
