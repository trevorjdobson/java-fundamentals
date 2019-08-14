package inheritence;

public class Review {
    String body;
    String author;
    int stars;
    Business business;

    Review(String body, String author, int stars, Business business){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.business = business;

    }

    public String toString(){

        return this.author + " gave " + this.business.name + " " + this.stars + " stars and wrote " + this.body;
    }
}
