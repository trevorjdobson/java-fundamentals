package inheritence;

import java.util.ArrayList;

public class Theater extends Business {
    ArrayList<String> moviesList;
    Theater(String name, double stars, int price) {
        super(name, stars, price);
        moviesList = new ArrayList<>();
    }
    public String toString(){
        String dollars = null;
        dollars = this.price <= 0 ? "$"
                : this.price == 1 ? "$$"
                : this.price == 2 ? "$$"
                : this.price == 3 ? "$$$"
                : this.price == 4 ? "$$$$"
                :  "$$$$$";

        String stars = Double.toString(this.stars);
        String output = this.name + " theater has a " + stars + " star rating and a price rating of: " + dollars + " with " + this.reviewsList.size() + " reviews.";

        return output;
    }
    public void addMovie(String movieName){
        moviesList.add(movieName);
    }
    public void removeMovie(String movieName){
        moviesList.removeIf(movie -> (movie.equals(movieName)));
    }

    public void addReview(Review theaterReview){
        this.reviewsList.add(theaterReview);
        double stars = 0.0;

        for(int i = 0; i<this.reviewsList.size();i++){
            stars += this.reviewsList.get(i).stars;
        }
        this.stars = stars/this.reviewsList.size();
    }
}
