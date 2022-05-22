package chapter3;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {

        Scanner auto = new Scanner(System.in);

        Car vehicle1 = new Car("Toyota", "2010", 2500.00);
        Car vehicle2 = new Car("Honda", "2010", 2600.00);

        System.out.printf("Your first car type should be a %s model, not later than %s and not less than $%.2f%n%n",
                vehicle1.getModel(), vehicle1.getYear(), vehicle1.getPrice());
        System.out.printf("Your second car type should be a %s model, not later than %s and not less than $%.2f%n%n",
                vehicle2.getModel(), vehicle2.getYear(), vehicle2.getPrice());

        System.out.print("Choose your first car model: ");
        String firstCarModel = auto.nextLine();
        vehicle1.setModel(firstCarModel);
        System.out.print("Choose your first car year: ");
        String firstCarYear = auto.nextLine();
        vehicle1.setYear(firstCarYear);
        System.out.print("Enter your first car price: ");
        double firstCarPrice = auto.nextDouble();
        vehicle1.setPrice(firstCarPrice);

        System.out.printf("Your first car choice is a %s %s that will cost you $%.2f%n%n",
                vehicle1.getYear(), vehicle1.getModel(), vehicle1.getPrice());

        auto.nextLine();

        System.out.print("Choose your second car model: ");
        String secondCarModel = auto.nextLine();
        vehicle2.setModel(secondCarModel);
        System.out.print("Choose your second car year: ");
        String secondCarYear = auto.nextLine();
        vehicle2.setYear(secondCarYear);
        System.out.print("Enter your second car price: ");
        double secondCarPrice = auto.nextDouble();
        vehicle2.setPrice(secondCarPrice);

        System.out.printf("Your second car choice is a %s %s that will cost you $%.2f%n%n",
                vehicle2.getYear(), vehicle2.getModel(), vehicle2.getPrice());

        System.out.print("Enter your first car's discount rate: ");
        double firstCarDiscount = auto.nextDouble();
        vehicle1.setDiscount(firstCarDiscount);

        System.out.print("Enter your second car's discount rate: ");
        double secondCarDiscount = auto.nextDouble();
        vehicle2.setDiscount(secondCarDiscount);

        System.out.printf("The %.1f percent discounted price for a %s %s is $%.2f%n%n",
                vehicle1.getDiscount(), vehicle1.getYear(), vehicle1.getModel(), vehicle1.getDiscountedPrice());
        System.out.printf("The %.1f percent discounted price for a %s %s is $%.2f%n",
                vehicle2.getDiscount(), vehicle2.getYear(), vehicle2.getModel(), vehicle2.getDiscountedPrice());
    }
}
