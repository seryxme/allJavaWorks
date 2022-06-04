package tdd;

public class FutureInvestment {


    public double futureInvestmentValue(double principal, double interest, int years) {
        double investmentAmount = principal;
        double annualInterestRate = interest;
        int numberOfYears = years;
        double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate/1200), (numberOfYears * 12));
        return futureInvestmentValue;
    }
}
