import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testArithmeticMethods() {

        // TEST CUBED METHOD
        assertEquals(8, AssessmentReview.cubed(2), 0);
        assertEquals(125, AssessmentReview.cubed(5), 0);
        assertEquals(15625, AssessmentReview.cubed(25), 0);

        // TEST DIFFERENCE METHOD (INT)
        assertEquals(100, AssessmentReview.difference(150, 50), 0);
        assertEquals(2, AssessmentReview.difference(5, 3), 0);

        // (DOUBLE)
        assertEquals(15.5, AssessmentReview.difference(20.0, 4.5), 0);

        // TEST MEDIAN METHOD
        assertEquals(4.5, AssessmentReview.median(new int[]{1, 3, 4, 2, 6, 5, 8, 7}), 0);
        assertEquals(7.0, AssessmentReview.median(new int[]{2, 20, 3, 7, 7, 5, 8, 7, 10, 0}), 0);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testPetObject() {

    }




}
