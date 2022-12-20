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

}
