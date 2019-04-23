import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void returnsFizzBuzzFor15() {
        assertEquals("FizzBuzz", FizzBuzz.runFizzBuzz(15));
    }
    @Test
    void returnsBuzzFor5() {
        assertEquals("Buzz", FizzBuzz.runFizzBuzz(5));
    }
    @Test
    void returnsFizzFor3() {
        assertEquals("Fizz", FizzBuzz.runFizzBuzz(3));
    }
    @Test
    void returns4For4() {
        assertEquals(4, FizzBuzz.runFizzBuzz(4));
    }
}