import com.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void shouldTestAddOperation() {
        Calculator calculator = new Calculator();
        int result = calculator.operate(2, 3, "add");

        assertEquals(5, result);
    }

}