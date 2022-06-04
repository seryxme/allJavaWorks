package tdd;

public class TestDriller {
    public int totalCost(int numOfCopies) {
        if (numOfCopies > 0) {
            if (numOfCopies < 5) return numOfCopies * 2000;

            if (numOfCopies > 4) {
                if (numOfCopies < 10) return numOfCopies * 1800;
            }
            if (numOfCopies > 9) {
                if (numOfCopies < 30) return numOfCopies * 1600;
            }
            if (numOfCopies > 29) {
                if (numOfCopies < 50) return numOfCopies * 1500;
            }
            if (numOfCopies > 49) {
                if (numOfCopies < 100) return numOfCopies * 1300;
            }
            if (numOfCopies > 99) {
                if (numOfCopies < 200) return numOfCopies * 1200;
            }
            if (numOfCopies > 199) {
                if (numOfCopies < 500) return numOfCopies * 1100;
            }
        }
        return numOfCopies * 1000;
    }
}
