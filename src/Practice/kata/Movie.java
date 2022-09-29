package Practice.kata;

import static java.lang.Math.ceil;

public class Movie {
    public static void main(String[] args) {
        System.out.println(movie(100, 10, 0.95));
    }

    public static int movie(int card, int ticket, double perc) {

        double ticketTotal = 0;
        for (int numOfVisits = 1; numOfVisits > 0; numOfVisits++) {

            ticketTotal += ticket * (Math.pow(perc, numOfVisits));
            int systemATotal = ticket * numOfVisits;
            double systemBTotal = card + ticketTotal;
            if (systemATotal > ceil(systemBTotal)) {
                return numOfVisits;
            }
        }
        return 0;
    }
}
