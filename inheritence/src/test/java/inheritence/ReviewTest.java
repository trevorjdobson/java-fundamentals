package inheritence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Restaurant testRestaurant;
    Review testReview;

    @Before
    public void setUp() throws Exception {
        testRestaurant = new Restaurant("Bill's",2,3);
        testReview = new Review("this place was awful", "Karen", 1, testRestaurant);
    }

    @Test
    public void testToString() {
        String expected = "Karen gave Bill's 1 stars and wrote this place was awful";
        System.out.println(testReview.toString());
        assertTrue(expected.equals(testReview.toString()));
    }
}