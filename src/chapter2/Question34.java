package chapter2;

public class Question34 {
    public static void main(String[] args) {

        long worldPopulation2022 = 7_953_952_577L;
        float  annualGrowthRate = 0.01f;

        long worldPopulation2023 = worldPopulation2022 + (worldPopulation2022 / 100);
        long worldPopulation2024 = worldPopulation2023 + (worldPopulation2023 / 100);
        long worldPopulation2025 = worldPopulation2024 + (worldPopulation2024 / 100);
        long worldPopulation2026 = worldPopulation2025 + (worldPopulation2025 / 100);
        long worldPopulation2027 = worldPopulation2026 + (worldPopulation2026 / 100);

        System.out.printf("The world population in the next one year will be %d%n", worldPopulation2023);
        System.out.printf("The world population in the next two years will be %d%n", worldPopulation2024);
        System.out.printf("The world population in the next three years will be %d%n", worldPopulation2025);
        System.out.printf("The world population in the next four years will be %d%n", worldPopulation2026);
        System.out.printf("The world population in the next five years will be %d%n", worldPopulation2027);

    }
}
