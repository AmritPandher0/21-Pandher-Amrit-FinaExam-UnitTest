import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator string;

    @BeforeEach
    public void setUp() {
        string = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        string = null;
    }

    @Test
    public void testNegative() {
        String numbers = "-1,5";
        assertThrows(IllegalArgumentException.class, ()-> {string.add(numbers);});
    }

    @Test
    public void testLargeNum() {
        assertEquals(1, string.add("1,1000"));
    }
}
