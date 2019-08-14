package inheritence;

public class ReviewTheater extends Review {
    String movieWatched;
    ReviewTheater(String body, String author, int stars, Business business,String movieWatched) {
        super(body, author, stars, business);
        this.movieWatched = movieWatched;
    }
    public String toString(){

        return this.author + " gave " + this.business.name + " " + this.stars + " stars after watching " + this.movieWatched + " and wrote " + this.body;
    }

}
