package Functions.Movie;

public class Review {
    
    private String reviewText;
    private String reviewName;
    private double rating;

    public Review(String reviewText, String reviewName, double rating) {
        this.reviewText = reviewText;
        this.reviewName = reviewName;
        this.rating = rating;
    }

    /******************************************* Getters *****************************************************************/
    public String getReviewText() {
        return reviewText;
    }

    public String getReviewName() {
        return reviewName;
    }

    public double getRating() {
        return rating;
    }
}
