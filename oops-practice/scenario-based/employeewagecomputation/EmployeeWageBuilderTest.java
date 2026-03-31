package employeewagecomputation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeWageBuilderTest {

    private EmployeeWageBuilder builder;

    @BeforeEach
    void setup() {
        builder= new EmployeeWageBuilder();
    }

    @Test
    void givenValidCompany_WhenAdded_ShouldNotThrowException() {

        assertDoesNotThrow(() -> 
            builder.addCompany("TCS", 20, 20, 100)
        );
    }

    @Test
    void givenInvalidCompanyName_WhenAdded_ShouldThrowException() {

        assertThrows(IllegalArgumentException.class, () -> 
            builder.addCompany("tcs", 20, 20, 100)
        );
    }

    @Test
    void givenCompany_WhenWageComputed_ShouldReturnPositiveWage() {

        builder.addCompany("Infosys", 25, 22, 120);
        builder.computeWage();

        int wage= builder.getTotalWage("Infosys");

        assertTrue(wage > 0);
    }

    @Test
    void givenUnknownCompany_WhenQueried_ShouldReturnMinusOne() {

        int wage= builder.getTotalWage("Unknown");

        assertEquals(-1, wage);
    }
}
