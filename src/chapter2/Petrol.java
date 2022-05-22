package chapter2;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {

        PetrolPurchase weeklyPurchase = new PetrolPurchase("Owode", "premium", 85, 161.50, 4.5);

        System.out.printf("Default location is %s.%nDefault petrol type is %s.%nDefault quantity is %d.%nDefault price is %.2f.%nDefault discount is %.2f.%n%n",
                weeklyPurchase.getLocation(), weeklyPurchase.getType(), weeklyPurchase.getQuantity(),
                weeklyPurchase.getPrice(), weeklyPurchase.getDiscount());

        Scanner purchase = new Scanner(System.in);

        System.out.print("Enter the location of the station: ");
        String purchaseLocation = purchase.nextLine();
        weeklyPurchase.setLocation(purchaseLocation);
        System.out.println();

        System.out.print("Enter the type of petrol: ");
        String typeOfPetrol = purchase.nextLine();
        weeklyPurchase.setType(typeOfPetrol);
        System.out.println();

        System.out.print("Enter the quantity of petrol to purchase: ");
        int quantityOfPetrol = purchase.nextInt();
        weeklyPurchase.setQuantity(quantityOfPetrol);
        System.out.println();

        System.out.print("Enter the price per litre of petrol: ");
        double petrolPrice = purchase.nextDouble();
        weeklyPurchase.setPrice(petrolPrice);
        System.out.println();

        System.out.print("Enter the discount rate: ");
        double purchaseDiscount = purchase.nextDouble();
        weeklyPurchase.setDiscount(purchaseDiscount);
        System.out.println();

        System.out.printf("Purchase of %d litres of %s petrol at N%.2f from %s Total station discounted at %.2f percent.%n%n",
                weeklyPurchase.getQuantity(), weeklyPurchase.getType(), weeklyPurchase.getPrice(),
                weeklyPurchase.getLocation(), weeklyPurchase.getDiscount());
        System.out.printf("The total cost of purchase will be N%.2f.", weeklyPurchase.getPurchaseAmount());
    }
}
