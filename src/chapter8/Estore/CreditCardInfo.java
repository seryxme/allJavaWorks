package chapter8.Estore;

public class CreditCardInfo {
    private String nameOnCard;
    private String creditCardNumber;
    private int cardExpirationYear;
    private int cardExpirationMonth;
    private int cardCvv;

    public CreditCardInfo(String name, String cardNumber, int year, int month, int cvv) {
        nameOnCard = name;
        creditCardNumber = cardNumber;
        cardExpirationYear = year;
        cardExpirationMonth = month;
        cardCvv = cvv;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getCardExpirationYear() {
        return cardExpirationYear;
    }

    public void setCardExpirationYear(int cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }

    public int getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    public void setCardExpirationMonth(int cardExpirationMonth) {
        this.cardExpirationMonth = cardExpirationMonth;
    }

    public void setCardCvv(int cardCvv) {
        this.cardCvv = cardCvv;
    }
}
