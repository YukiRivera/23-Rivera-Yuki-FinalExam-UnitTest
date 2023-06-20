import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StringCalculatorTest {

    StringCalculator str;

    @BeforeEach
    public void setUp(){
        str = new StringCalculator();
    }

    @AfterEach
    public void tearDown(){
        str = null;
    }

    @Test
    public void AddTest1(){
        assertThrows(IllegalArgumentException.class, ()->{str.add("-1");});
    }

    @Test
    public void AddTest2(){
        int result = str.add("1, 1000, 2");
        assertEquals(3, result);
    }


}
