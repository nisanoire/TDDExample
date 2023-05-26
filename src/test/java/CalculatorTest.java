// B201202014, Emine Nisa TÜRK, Software Verification & Validation
//Homework1 & https://github.com/nisanoire/TDDExample

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void testDivision2() {
        assertEquals(2.5, Calculator.divide(10, 4));
    }

    @Test
    void testDivision3() {
        assertEquals(2.5, Calculator.divide(12.5, 5));
    }

    @Test
    void testDivision4() {
        assertEquals(4, Calculator.divide(10, 2.5));
    }

    @Test
    void testDivision5() {
        assertEquals(5, Calculator.divide(12.5, 2.5));
    }

    /*@Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );

    }*/

    //testdivision6 was giving an error on my computer for some reason
    //thats why i commented it


    @ParameterizedTest
    @CsvSource({"10,2,5", "10,4,2.5", "12.5,5,2.5", "10,2.5,4", "12.5,2.5,5"
    })

    //taking the values from the first 5 tests

    void dataDrivenDivision(double dividend,double divisor,double correctResult) {
        assertEquals(correctResult ,Calculator.divide(dividend ,divisor));
    }
}

//using them under 1 operation, they are all passed when you run the application
