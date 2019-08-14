package inheritence;

import java.util.ArrayList;

public class Business {
    String name;
    double stars;
    int price;
    ArrayList<Review> reviewsList = new ArrayList<>();

    Business(String name, double stars, int price){
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviewsList = reviewsList;
    }

}
