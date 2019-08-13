package inheritence;

import java.util.ArrayList;

public class Restaurant {
    String name;
    double stars;
    int price;
    ArrayList<Review> reviewsList = new ArrayList<>();

    Restaurant(String name, double stars, int price){
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviewsList = reviewsList;
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
        String output = this.name + " restaurant has a " + stars + " star rating and a price rating of: " + dollars;
        
        return output;
    }

    public void addReview(Review review){
        this.reviewsList.add(review);
        double stars = 0.0;

        for(int i = 0; i<this.reviewsList.size();i++){
            stars += this.reviewsList.get(i).stars;
        }
        this.stars = stars/this.reviewsList.size();
    }
}
