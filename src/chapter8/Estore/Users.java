package chapter8.Estore;

public class Users {
    private String name;
    private int age;
    private String phoneNumber;
    private String emailAddress;
    private String password;
    private Address homeAddress;

    public Users() {
        homeAddress = new Address();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void addHomeAddress(Address address) {
        homeAddress = address;
    }
    public Address getHomeAddress() {
        return homeAddress;
    }
}
