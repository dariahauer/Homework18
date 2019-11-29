import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumbersTest {

    private FibonacciNumbers fibonacciNumbers;

    @BeforeEach
    void setUp() {
        fibonacciNumbers = new FibonacciNumbers();
    }

    @Test
    public void shouldReturn10for5() {
        //given
        //when
        long result = (long) fibonacciNumbers.calculateNumbers(5);
        //then
        assertEquals(result, 10);
    }

    @Test
    public void shouldReturn44for10() {
        //given
        //when
        long result = (long) fibonacciNumbers.calculateNumbers(10);
        //then
        assertEquals(result, 44);
    }

    @Test
    public void shouldReturn4613732for34() {
        //given
        //when
        long result = (long) fibonacciNumbers.calculateNumbers(34);
        //then
        assertEquals(result, 4613732);
    }






}
