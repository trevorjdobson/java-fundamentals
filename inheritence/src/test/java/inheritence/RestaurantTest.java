package inheritence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    Restaurant testRestaurant;
    Review testReview;
    Review testReviewTwo;
    Review testReviewThree;
    @Before
    public void setUp() throws Exception {
        testRestaurant = new Restaurant("Bills",2,3);
        testReview = new Review("this place was awful", "Karen", 1, testRestaurant);
        testReviewTwo = new Review("this place was great", "Bob", 4, testRestaurant);
        testReviewThree = new Review("this place was amazing", "Billy", 5, testRestaurant);
    }


    @Test
    public void testToString() {
        String expected = "Bills restaurant has a 2.0 star rating and a price rating of: $$$ with 0 reviews.";
        System.out.println(testRestaurant.toString());
        assertTrue(expected.equals(testRestaurant.toString()));
    }
    @Test
    public void testAddReview_ShowListSize(){
        testRestaurant.addReview(testReview);
        testRestaurant.addReview(testReviewTwo);
        testRestaurant.addReview(testReviewThree);


        int expected = 3;
        assertTrue(expected == testRestaurant.reviewsList.size());

    }

    @Test
    public void testAddReview_GetReviewFromList(){
        testRestaurant.addReview(testReview);
        testRestaurant.addReview(testReviewTwo);
        testRestaurant.addReview(testReviewThree);

        System.out.println(testRestaurant.stars);
        String expected = "Bob gave Bills 4 stars and wrote this place was great";
        assertTrue(expected.equals(testRestaurant.reviewsList.get(1).toString()));

    }
    @Test
    public void testAddReview_StarsNewAverage(){
        testRestaurant.addReview(testReview);
        testRestaurant.addReview(testReviewTwo);
        testRestaurant.addReview(testReviewThree);

        double expected = 3.3333333333333335;
        assertTrue(expected == testRestaurant.stars);

    }
}