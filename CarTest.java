import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {

    private Car auto;

    @BeforeEach
    void setUp() {
        auto = new Car(15); // initial odometer reading
    }

    @Test
    void testInitialOdometer() {
        assertEquals(15, auto.getStartMiles(), "Initial odometer reading should match constructor value.");
    }

    @Test
    void testSingleFillUpAndCalculateMPG() {
        auto.fillUp(150, 8);  // 135 miles / 8 gallons = 16.875
        assertEquals(16.875, auto.calculateMPG(), 0.001, "MPG calculation is incorrect.");
    }

    @Test
    void testMultipleCallsCalculateMPGWithoutReset() {
        auto.fillUp(150, 8);
        double firstCall = auto.calculateMPG();
        double secondCall = auto.calculateMPG();
        assertEquals(firstCall, secondCall, "MPG should not change unless reset is called.");
    }

    @Test
    void testResetMPG() {
        auto.fillUp(150, 8);
        auto.calculateMPG(); // should be 16.875
        auto.resetMPG();
        auto.fillUp(350, 10);
        auto.fillUp(450, 20); // total: 100 + 100 miles = 200 miles / 30 gallons = 10.0
        assertEquals(10.0, auto.calculateMPG(), 0.001, "Reset MPG calculation is incorrect.");
    }

    @Test
    void testFinalScenario() {
        auto.resetMPG();
        auto.fillUp(603, 25.5); // 153 miles / 25.5 gallons = 6.0
        assertEquals(6.0, auto.calculateMPG(), 0.001, "Final MPG calculation should be 6.0.");
    }
}
