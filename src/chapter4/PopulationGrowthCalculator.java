package chapter4;

public class PopulationGrowthCalculator {
    public static void main(String[] args) {

        long currentWorldPopulation = 7_944_305_051L;
        double annualPopulationGrowthRate = 1.05;

        int counter = 1;
        int year = 2022;
        long population = currentWorldPopulation;

        System.out.println("Year\t\tProjected Population\t\tAnnual Increase\n");

        while (counter <= 75) {
            year += 1;
            double increase = population * annualPopulationGrowthRate / 100;
            population += increase;
            counter++;
            System.out.printf("%d\t\t%d\t\t\t\t\t%.0f\n", year, population, increase);
            }
        System.out.println("The world population will be double current population by 2089.");
    }
}
