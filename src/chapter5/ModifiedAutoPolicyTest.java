package chapter5;

import java.util.Scanner;

public class ModifiedAutoPolicyTest {
    public static void main(String[] args) {
        ModifiedAutoPolicy policy1 =
                new ModifiedAutoPolicy(11111111, "Toyota Camry", "NJ" );
        ModifiedAutoPolicy policy2 =
                new ModifiedAutoPolicy(22222222, "Ford Fusion", "ME");
        Scanner dataReader = new Scanner(System.in);

        System.out.println("Enter the state code for Policy 1: ");
        String stateCode = dataReader.nextLine();
        policy1.setState(stateCode);

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(ModifiedAutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }
}