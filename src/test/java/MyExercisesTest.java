import com.personalprojects.regularexpressionspractice.MyExercises;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MyExercisesTest {

    MyExercises myExercises = new MyExercises();

    @Test
    public void splitNotLetter() {
        //arrange
        String expected = "The quick brown fox jumped over the lazydog";

        //act
        String actual = myExercises.splitNotLetter("The*quick5brown)fox jumped@over45the><6lazydog");

        //assert
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void normalizeNum() {
        String ccDash = "1234-5678-9012-3456";
        String ccStar = "1234*5678*9012*3456";
        String ccSpace = "1234 5678 9012 3456";

        Assertions.assertEquals("1234567890123456", myExercises.normalizeNum(ccDash));
        Assertions.assertEquals("1234567890123456", myExercises.normalizeNum(ccStar));
        Assertions.assertEquals("1234567890123456", myExercises.normalizeNum(ccSpace));
    }

    @Test
    public void maskNum() {
        String ccDash = "1234-5678-9012-3456";
        String ccStar = "1234*5678*9012*3456";
        String ccSpace = "1234 5678 9012 3456";
        String ccMix = "1234!5678&9012*3456";
        String expected = "XXXX-XXXX-XXXX-3456";

        Assertions.assertEquals(expected, myExercises.maskNum(ccDash));
        Assertions.assertEquals(expected, myExercises.maskNum(ccStar));
        Assertions.assertEquals(expected, myExercises.maskNum(ccSpace));
        Assertions.assertEquals(expected, myExercises.maskNum(ccMix));

    }

}
