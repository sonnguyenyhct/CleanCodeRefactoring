import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    public final String FIZZ = "Fizz";
    public final String BUZZ = "Buzz";
    public final String FIZZBUZZ = "FizzBuzz";

    @Test
    void testFizz3() {
        int number = 3;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(FIZZ, result);
    }

    @Test
    void testFizz6() {
        int number = 6;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(FIZZ, result);
    }

    @Test
    void testBuzz5() {
        int number = 5;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(BUZZ, result);
    }

    @Test
    void testBuzz10() {
        int number = 10;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(BUZZ, result);
    }

    @Test
    void testFizzBuzz15() {
        int number = 15;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(BUZZ, result);
    }

    @Test
    void testFizzBuzz30() {
        int number = 30;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(FIZZBUZZ, result);
    }
}