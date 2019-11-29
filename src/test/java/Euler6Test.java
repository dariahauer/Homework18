import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Euler6Test {

    private Euler6 euler6;

    @BeforeEach
    void setUp() {
        euler6 = new Euler6();
    }

    @Test
    public void shouldReturn170() {
        //given
        //when
        double result = euler6.difference(5);
        //then
        assertEquals(result, 170, 0);
    }

    @Test
    public void shouldReturn2640() {
        //given

        //when
        double result = euler6.difference(10);
        //then
        assertEquals(result, 2640, 0);
    }

    @Test
    public void shouldReturn25164150() {
        //given
        //when
        double result = euler6.difference(100);
        //then
        assertEquals(result, 25164150, 0);
    }

}

