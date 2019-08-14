package inheritence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater testTheater;
    ReviewTheater testReview;
    ReviewTheater testReviewOne;
    ReviewTheater testReviewTwo;
    Review testReviewWithoutMovie;
    @Before
    public void setUp() throws Exception {
        testTheater = new Theater("Regal Cinema", 3,3);
        testReview = new ReviewTheater("this place was awful", "Karen", 1, testTheater,"Top Gun");
        testReviewOne = new ReviewTheater("this place was great", "Bob", 4, testTheater,"Days of Thunder");
        testReviewTwo = new ReviewTheater("this place was amazing", "Billy", 5, testTheater, "Rain Man");
    }

    @Test
    public void testToString() {
        String expected = "Regal Cinema theater has a 3.0 star rating and a price rating of: $$$ with 0 reviews.";
        assertTrue(expected.equals(testTheater.toString()));
    }

    @Test
    public void testAddReview_ShowListSize(){
        testTheater.addReview(testReview);
        testTheater.addReview(testReviewOne);
        testTheater.addReview(testReviewTwo);


        int expected = 3;
        assertTrue(expected == testTheater.reviewsList.size());

    }

    @Test
    public void testAddReview_GetReviewFromList(){
        testTheater.addReview(testReview);
        testTheater.addReview(testReviewOne);
        testTheater.addReview(testReviewTwo);

        System.out.println(testTheater.reviewsList.get(1).toString());
        String expected = "Bob gave Regal Cinema 4 stars after watching Days of Thunder and wrote this place was great";
        assertTrue(expected.equals(testTheater.reviewsList.get(1).toString()));

    }
    @Test
    public void testAddReview_WithoutMovieWatched(){
        testReviewWithoutMovie = new Review("this place was amazing", "Billy", 5, testTheater);
        testTheater.addReview(testReviewWithoutMovie);


        System.out.println(testTheater.reviewsList.get(0).toString());
        String expected = "Billy gave Regal Cinema 5 stars and wrote this place was amazing";

        assertTrue(expected.equals(testTheater.reviewsList.get(0).toString()));

    }
    @Test
    public void testAddReview_StarsNewAverage(){
        testTheater.addReview(testReview);
        testTheater.addReview(testReviewOne);
        testTheater.addReview(testReviewTwo);

        double expected = 3.3333333333333335;
        assertTrue(expected == testTheater.stars);

    }
    @Test
    public void testAddMovie(){
        testTheater.addMovie("Test");
        String expected = "Test";
        String actual = testTheater.moviesList.get(0);
        assertTrue(expected.equals(actual));
    }
    @Test
    public void testRemoveMovie(){
        testTheater.addMovie("Test");
        testTheater.addMovie("Testing");
        testTheater.removeMovie("Test");
        int expectedSize = 1;
        int actualSize = testTheater.moviesList.size();
        assertTrue(expectedSize == actualSize);
    }
}