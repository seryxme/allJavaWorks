package tdd;

public class Kata {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        }
        return secondNumber - firstNumber;
    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int quotient(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public int flipper(int bit) {
        if (bit == 1) return 0;
        return 1;
    }

    public String numberChecker(int number) {
        if (number % 2 == 0) {
            return number + " is an even number.";
        }
        return number + " is an odd number.";
    }

    int mysteryNumber = 7;

    public String guess(int guessedNumber) {
        if (guessedNumber > mysteryNumber) return "Too high.";
        if (guessedNumber < mysteryNumber) return "Too low.";
        return "Correct!";
    }

    public double futureInvestmentValue(double principal, double interest, int years) {
        double investmentAmount = principal;
        double annualInterestRate = interest;
        int numberOfYears = years;
        double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate/1200), (numberOfYears * 12));

        return futureInvestmentValue;
    }

    public double monthlyInterest(double balance, double annualInterest) {
        double interest = balance * annualInterest / 1200;

        return interest;
    }

    public double drivingCost(double distance, double milesPerGallon, double pricePerGallon) {
        double price = pricePerGallon;
        double efficiency = milesPerGallon;
        double costOfDriving = price * distance / efficiency;

        return costOfDriving;
    }

    public double areaOfTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 = Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        double side2 = Math.sqrt(((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2)));
        double side3 = Math.sqrt(((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)));

        double s = (side1 + side2 + side3) / 2;

        double s1 = s * (s - side1) * (s - side2) * (s - side3);

        double areaOfTriangle = Math.sqrt(s1);

        return areaOfTriangle;
    }

    public double bmiCalculator(double weightInPounds, double heightInInches) {

        double bmi = weightInPounds * 0.45359237/(heightInInches * 0.0254 * heightInInches *0.0254);

        return bmi;
    }

    public double compoundValue(double savings) {
        double monthlyInterestRate = 0.00417;

        double month1 = savings * (1 + monthlyInterestRate);
        double month2 = (savings + month1) * (1 + monthlyInterestRate);
        double month3 = (savings + month2) * (1 + monthlyInterestRate);
        double month4 = (savings + month3) * (1 + monthlyInterestRate);
        double month5 = (savings + month4) * (1 + monthlyInterestRate);
        double month6 = (savings + month5) * (1 + monthlyInterestRate);

        return month6;
    }

    public String scoresToGrades(int userScore) {
        if (userScore <= 100) {
            if (userScore >= 90) {
                return "A";
            }
        }
        if (userScore < 90) {
            if (userScore >= 80) {
                return "B";
            }
        }
        if (userScore < 80) {
            if (userScore >= 70) {
                return "C";
            }
        }
        if (userScore < 70) {
            if (userScore >= 60) {
                return "D";
            }
        }
        if (userScore < 60) return "F";

        return "Not allowed.";
    }

    public static int factorsOf(int number) {
        int factorCounter = 0;
        int factor = 1;
        while(factor <= number) {
            if (number % factor == 0) ++factorCounter;
            factor++;
        }
        return factorCounter;
    }

    public static boolean isPrime(int number) {
        return factorsOf(number) == 2;
    }
}
