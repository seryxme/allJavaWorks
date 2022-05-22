package chapter5;//Exercise 5.30

import java.util.Objects;

public class ModifiedAutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;
    public ModifiedAutoPolicy(int accountNumber, String makeAndModel,
                      String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
    public String getMakeAndModel() {
        return makeAndModel;
    }
    public void setState(String state) {
        if (Objects.equals(state, "CT") || Objects.equals(state, "MA")) {
            this.state = state;
        } else if (Objects.equals(state, "ME") || Objects.equals(state, "NH")) {
            this.state = state;
        } else if (Objects.equals(state, "NJ") || Objects.equals(state, "NY")) {
            this.state = state;
        } else if (Objects.equals(state, "PA") || Objects.equals(state, "VT")) {
            this.state = state;
        } else System.out.println("State code is invalid. Please try again.");
    }
    public String getState() {
        return state;
    }
    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
