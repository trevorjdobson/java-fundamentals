package inheritence;

public class Restaurant extends Business{


    Restaurant(String name, double stars, int price) {
        super(name, stars, price);
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
        String output = this.name + " restaurant has a " + stars + " star rating and a price rating of: " + dollars + " with " + this.reviewsList.size() + " reviews.";

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
