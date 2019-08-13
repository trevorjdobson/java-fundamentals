package inheritence;

public class Review {
    String body;
    String author;
    int stars;
    Restaurant restaurant;

    Review(String body, String author, int stars, Restaurant restaurant){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;

    }

    public String toString(){

        return this.author + " gave " + this.restaurant.name + " " + this.stars + " stars and wrote " + this.body;
    }
}
