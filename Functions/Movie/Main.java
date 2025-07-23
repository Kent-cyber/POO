package Functions.Movie;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Movie movie1 = new Movie("The Lighthouse", "Robert Eggers",
            new ArrayList<>(Arrays.asList("Robert Pattinson", "Willem Dafoe")));

        Review review1 = new Review("Super film !", "Paul Legac", 4.5);
        Review review2 = new Review("A voir absolument !", "Julien Levendu", 4.8);

        movie1.addReview(review1);
        movie1.addReview(review2);

        System.out.println("\nLa review du film '" + movie1.getTitle() + "' :");
        for (Review review : movie1.getReviews()) {
            System.out.println(review.getReviewText() + " de " + review.getReviewName() + " - " + review.getRating());
        }
    }
}
