package chapter9;

public class Customer {
    private int customerId;
    private String firstName;
    private String middleName = " ";
    private String lastName;
    private int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String address;
    private String gender;
    private String phoneNumber;
    private String emailAddress;
    private int accountCount;
    private Account[] myAccount = new Account[5];
    private String bank;
    private Bank myBank;

    public Customer(Bank bank, int customerId, String firstName, String lastName, String phoneNumber) {
        myBank = bank;
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String myBankInfo() {
        bank = String.format("%s, %s", myBank.getBankName(), myBank.getBranch());
        return bank;
    }

    public Bank getMyBank() {
        return myBank;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMyAccount(Account account) {
        myAccount[accountCount] = account;
        accountCount++;
    }

    public Account getMyAccount() {
        return myAccount[0];
    }

    public Account getMyAccount(int number) {
        return myAccount[number - 1];
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String displayDateOfBirth() {
        return String.format("%02d/%02d/%d", dateOfBirth, monthOfBirth, yearOfBirth);
    }

    @Override
    public String toString() {

        return String.format("Full Name: %s%nAccount No.: %s%nPhone No: %s%nEmail: %s%nD. O. B.: %s%nAddress: %s",
                getMyAccount().getAccountName(), getMyAccount().getAccountNumber(), phoneNumber, emailAddress,
                displayDateOfBirth(), address);
    }

    public void closeAccount(Account account) {
        for(int i = 0; i < myAccount.length; i++) {
            if (myAccount[i] == account) {
                myAccount[i].setAccountName(null);
                myAccount[i] = null;

                break;
            }
            else System.out.println("Account not found.");
        }

    }
}
