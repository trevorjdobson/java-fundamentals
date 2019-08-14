package inheritence;

public class ShopReview extends Review {

    ShopReview(String body, String author, int stars, Restaurant restaurant) {
        super(body, author, stars, restaurant);
    }
}
