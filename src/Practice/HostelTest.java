package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HostelTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Hostel house = new Hostel("Odinaka", 14, "08123456789");
        Hostel value = new Hostel("Ayo", 56, "08023456789");

        try {
            System.out.println("Enter resident age: ");
            int age = input.nextInt();
            house.setResidentAge(age);
        }
        catch (InputMismatchException | ArithmeticException ex) {
            System.out.println(ex);
        }

//       house.setResidentName("Odinaka");
//       house.setResidentAge(14);
//       int ageLater = house.calculateFutureAge( 43);
////        String name = house.getResidentName();
//        System.out.println(ageLater);
//
////        System.out.println(name);
//        //System.out.println(house.getResidentAge());
//        System.out.println();
//        value.setResidentName("Tunde");
//        value.setResidentAge(56);
//        int ageLater1 = value.calculateFutureAge( 43);
////        System.out.println(value.getResidentName());
//        //System.out.println(value.getResidentAge());
//
//
//        System.out.println(ageLater1);

    }
}
