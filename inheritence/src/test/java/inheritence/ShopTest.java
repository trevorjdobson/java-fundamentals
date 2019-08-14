package inheritence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop testShop;
    Review testReview;
    Review testReviewOne;
    Review testReviewTwo;
    @Before
    public void setUp() throws Exception {
        testShop = new Shop("REI", "Sporting goods", 4,3);
        testReview = new Review("this place was awful", "Karen", 1, testShop);
        testReviewOne = new Review("this place was great", "Bob", 4, testShop);
        testReviewTwo = new Review("this place was amazing", "Billy", 5, testShop);
    }

    @Test
    public void testToString() {
        String expteced = "REI is a  Sporting goods store with a 4.0 star rating and a price rating of: $$$ with 0 reviews.";
        assertTrue(expteced.equals(testShop.toString()));

    }
    @Test
    public void testAddReview_ShowListSize(){
        testShop.addReview(testReview);
        testShop.addReview(testReviewOne);
        testShop.addReview(testReviewTwo);


        int expected = 3;
        assertTrue(expected == testShop.reviewsList.size());

    }

    @Test
    public void testAddReview_GetReviewFromList(){
        testShop.addReview(testReview);
        testShop.addReview(testReviewOne);
        testShop.addReview(testReviewTwo);

        System.out.println(testShop.reviewsList.get(1).toString());
        String expected = "Bob gave REI 4 stars and wrote this place was great";
        assertTrue(expected.equals(testShop.reviewsList.get(1).toString()));

    }
    @Test
    public void testAddReview_StarsNewAverage(){
        testShop.addReview(testReview);
        testShop.addReview(testReviewOne);
        testShop.addReview(testReviewTwo);

        double expected = 3.3333333333333335;
        assertTrue(expected == testShop.stars);

    }
}